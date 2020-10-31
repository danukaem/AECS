package com.aecs.AECS.service;

import com.aecs.AECS.repository.AuthenticationRepository;
import com.aecs.AECS.repository.DeliveryRepository;
import com.aecs.AECS.repository.entity.Authentication;
import com.aecs.AECS.repository.entity.Delivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    AuthenticationRepository authenticationRepository;

    @Autowired
    public AuthenticationService(AuthenticationRepository authenticationRepository) {
        this.authenticationRepository = authenticationRepository;
    }

    public Authentication getUserById(int id){

        return authenticationRepository.findById(id).get();
    }
    public Authentication saveUser(Authentication user){

        return authenticationRepository.save(user);
    }
}
