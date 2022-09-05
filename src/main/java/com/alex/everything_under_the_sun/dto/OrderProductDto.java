package com.alex.everything_under_the_sun.dto;

import com.alex.everything_under_the_sun.model.Product;

import javax.persistence.ManyToOne;

/**
 * Trying to implement a dto pattern
 * Data transfer object that carries data between processes
 * in order to reduce the number of method calls
 */

public class OrderProductDto {

    @ManyToOne
    private Product product;
    private Integer quantity;

    public Product getProduct()
    {
        return product;
    }

    public void setProduct(Product product)
    {
        this.product = product;
    }

    public Integer getQuantity()
    {
        return quantity;
    }

    public void setQuantity(Integer quantity)
    {
        this.quantity = quantity;
    }
}