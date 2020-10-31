package com.aecs.AECS.controller;

import com.aecs.AECS.repository.entity.Delivery;
import com.aecs.AECS.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeliveryController {

    DeliveryService deliveryService;

    @Autowired
    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }


    @GetMapping("/healthCheck")
    public String healthCheck() {
        return "running...";
    }

    @GetMapping("/getDelivery/{id}")
    public Delivery getDeliveryById(@PathVariable("id") Integer id) {

        return deliveryService.getDeliveryById(id);
    }

    @GetMapping("/getDeliveryByTrackingCode/{code}")
    public Delivery getDeliveryById(@PathVariable("code") String code) {

        return deliveryService.getDeliveryByTrackinCode(code);
    }

    @PostMapping("/saveDelivery")
    public Delivery saveDelivery(@RequestBody Delivery delivery) {

        return deliveryService.saveDelivery(delivery);
    }
    @PostMapping("/cancelDelivery")
    public Delivery cancelDelivery(@RequestBody Delivery delivery) {

        return deliveryService.cancelDelivery(delivery);
    }
}
