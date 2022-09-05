package com.alex.everything_under_the_sun.service;

import com.alex.everything_under_the_sun.model.Order;
import com.alex.everything_under_the_sun.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository)
    {
        this.orderRepository = orderRepository;
    }

    @Override
    public Iterable<Order> getAllOrders()
    {
        return this.orderRepository.findAll();
    }

    @Override
    public Order create(Order order)
    {
        order.setDateCreated(LocalDate.now());
        return this.orderRepository.save(order);
    }

    @Override
    public Order update(Order order)
    {
        return this.orderRepository.save(order);
    }
}
