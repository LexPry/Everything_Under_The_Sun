package com.alex.everything_under_the_sun.service;

import com.alex.everything_under_the_sun.model.OrderProduct;
import com.alex.everything_under_the_sun.repositories.OrderProductRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class OrderProductServiceImpl implements OrderProductService{
    private final OrderProductRepository orderProductRepository;

    public OrderProductServiceImpl(OrderProductRepository orderProductRepository) {
        this.orderProductRepository = orderProductRepository;
    }

    @Override
    public OrderProduct create(OrderProduct orderProduct) {
        return this.orderProductRepository.save(orderProduct);
    }
}
