package com.techbud.orderService.service;

//import jakarta.annotation.PostConstruct;
//import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getUserInfo() {
        return "User info";
    }

//    @PostConstruct
    public void initialize() {
        System.out.println("UserService initialized");
    }

//    @PreDestroy
    public void cleanup() {
        System.out.println("UserService cleaned up");
    }

}
