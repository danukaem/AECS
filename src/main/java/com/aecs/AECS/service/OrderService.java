package com.aecs.AECS.service;

import com.aecs.AECS.repository.OrderRepository;
import com.aecs.AECS.repository.entity.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderService {
    OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderItem getOrderById(int id) {

        return orderRepository.findById(id).get();
    }

    public Iterable<OrderItem> getOrders() {

        return orderRepository.findAll();
    }

    public OrderItem saveOrder(OrderItem orderItem) {

        return orderRepository.save(orderItem);
    }
}
