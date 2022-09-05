package com.alex.everything_under_the_sun.model;

import lombok.*;
import net.minidev.json.annotate.JsonIgnore;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Transient;
import java.util.Objects;


@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class OrderProduct {

    @EmbeddedId
    @JsonIgnore
    private OrderProductPK pk;

    @Column(nullable = false)
    private Integer quantity;

    public OrderProduct(Order order, Product product, Integer quantity)
    {
        pk = new OrderProductPK();
        pk.setOrder(order);
        pk.setProduct(product);
        this.quantity = quantity;
    }

    @Transient
    public Product getProduct()
    {
        return this.pk.getProduct();
    }

    public Double getTotalPrice()
    {
        return this.getProduct().getPrice() * getQuantity();
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        OrderProduct that = (OrderProduct) o;
        return pk != null && Objects.equals(pk, that.pk);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(pk);
    }
}
