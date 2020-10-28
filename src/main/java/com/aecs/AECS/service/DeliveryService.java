package com.aecs.AECS.service;

import com.aecs.AECS.repository.DeliveryRepository;
import com.aecs.AECS.repository.entity.Delivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {
    DeliveryRepository deliveryRepository;

    @Autowired
    public DeliveryService(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    public Delivery getDeliveryById(int id){

        return deliveryRepository.findById(id).get();
    }
    public Delivery getDeliveryByTrackinCode(String code){

        return deliveryRepository.findByTrackingCode(code);
    }

    public Delivery saveDelivery(Delivery delivery){

        return deliveryRepository.save(delivery);
    }
    public Delivery cancelDelivery(Delivery delivery){

        return deliveryRepository.save(delivery);
    }
}
