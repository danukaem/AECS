package com.aecs.AECS.controller;

import com.aecs.AECS.repository.entity.Authentication;
import com.aecs.AECS.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthenticationController {

    AuthenticationService authenticationService;

    @Autowired
    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }


    @GetMapping("/healthCheck")
    public String healthCheck() {
        return "running...";
    }

    @GetMapping("/getUser/{id}")
    public Authentication getUserById(@PathVariable("id") Integer id) {

        return authenticationService.getUserById(id);
    }


    @PostMapping("/saveUser")
    public Authentication saveUser(@RequestBody Authentication authentication) {

        return authenticationService.saveUser(authentication);
    }

}
