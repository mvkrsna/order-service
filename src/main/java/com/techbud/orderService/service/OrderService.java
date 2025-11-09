package com.techbud.orderService.service;

import com.techbud.orderService.entity.Order;
import com.techbud.orderService.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public Order getOrderById(Long id) {
        Order order = orderRepository.getOrderById(id);
        return order;
    }

}
