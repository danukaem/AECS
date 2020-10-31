package com.aecs.AECS.repository;

import com.aecs.AECS.repository.entity.OrderItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<OrderItem,Integer> {
}
