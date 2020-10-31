package com.aecs.AECS.repository;

import com.aecs.AECS.repository.entity.Delivery;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends CrudRepository<Delivery,Integer> {

    Delivery findByTrackingCode(String trackingCode);

}
