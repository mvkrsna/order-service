package com.techbud.orderService.controller;

import com.techbud.orderService.entity.Order;
import com.techbud.orderService.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/getOrderById")
    public ResponseEntity<?> placeOrder(@RequestParam Long productId) {
        Order order = orderService.getOrderById(productId);
        if (order == null) {
            return ResponseEntity.status(404).body("Order not found for product ID: " + productId);
        }
        return ResponseEntity.ok("Order placed for product: " + order.getName() + " with price: " + order.getPrice());
    }

}
