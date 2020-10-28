package com.aecs.AECS.controller;

import com.aecs.AECS.repository.entity.OrderItem;
import com.aecs.AECS.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class OrderController {

    OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/getOrder/{id}")
    public OrderItem getOrderById(@PathVariable("id") Integer id) {
        return orderService.getOrderById(id);
    }

    @GetMapping("/getOrders")
    public Iterable<OrderItem> getOrders() {
        return orderService.getOrders();
    }

    @PostMapping("/saveOrder")
    public OrderItem saveOrder(@RequestBody OrderItem orderItem) {
        return orderService.saveOrder(orderItem);
    }

}
