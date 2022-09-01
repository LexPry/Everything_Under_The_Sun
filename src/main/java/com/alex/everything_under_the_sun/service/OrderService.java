package com.alex.everything_under_the_sun.service;

import com.alex.everything_under_the_sun.model.Order;

public interface OrderService {

    public Iterable<Order> getAllOrders();

    public Order create(Order order);

    public Order update(Order order);
}
