package com.alex.everything_under_the_sun.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.transaction.Transactional;
import javax.validation.Valid;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "orders")
public class Order {
    @ToString.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @ToString.Include
    @JsonFormat(pattern = "MM/dd/yyyy")
    private LocalDate dateCreated;
    @ToString.Include
    private String status;

    @Basic(fetch = FetchType.LAZY)
    @JsonManagedReference
    @OneToMany(mappedBy = "pk.order")
    private List<OrderProduct> orderProducts = new ArrayList<>();

    @Transient
    public double getTotalOrderPrice() {
        double sum = 0D;
        List<OrderProduct> orderProducts = getOrderProducts();
        for (OrderProduct orderProduct : orderProducts) {
            sum += orderProduct.getPrice();
        }
        return sum;
    }

    @Transient
    public int getNumberOfProducts() {
        return this.orderProducts.size();
    }
}
