package com.alex.everything_under_the_sun.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "Product name is required")
    @Basic(optional = false)
    private String name;
    private double price;
    private String description;
    private String pictureUrl;

    // TODO: Look into the date class, see if tracking products by timestamp is something you want
}
