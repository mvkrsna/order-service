package com.techbud.orderService.repository;

import com.techbud.orderService.entity.Order;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {

    public Order getOrderById(Long orderId) {
        Order order = Order.builder()
                .id(orderId)
                .name("Order " + orderId)
                .price(100.0)
                .build();

        return order;
    }

}
