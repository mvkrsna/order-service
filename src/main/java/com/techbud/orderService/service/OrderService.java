package com.techbud.orderService.service;

import com.techbud.orderService.entity.Order;
import com.techbud.orderService.repository.OrderRepository;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements InitializingBean, DisposableBean {

    @Autowired
    OrderRepository orderRepository;

    public Order getOrderById(Long id) {
        Order order = orderRepository.getOrderById(id);
        return order;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("OrderService initialized");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("OrderService destroyed");

    }
}
