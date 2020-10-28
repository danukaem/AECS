package com.aecs.AECS.repository;

import com.aecs.AECS.repository.entity.Authentication;
import com.aecs.AECS.repository.entity.Delivery;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticationRepository extends CrudRepository<Authentication,Integer> {
}
