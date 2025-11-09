package com.techbud.orderService.service;

import com.techbud.orderService.entity.Order;
import com.techbud.orderService.repository.OrderRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {

    @Mock
    OrderRepository orderRepository;

    @InjectMocks
    OrderService orderService;

    // Unit test for getOrderById method
    // Happy flow
    @Test
    public void getOrderById() {
        Order order = Order.builder().id(1L).name("Test Order").price(150.0).build();
        when(orderRepository.getOrderById(order.getId())).thenReturn(order);
        Order expectedOrderInformation = orderService.getOrderById(order.getId());
        Assertions.assertNotNull(expectedOrderInformation);
        Assertions.assertEquals(order.getId(), expectedOrderInformation.getId());
        Assertions.assertEquals(order.getName(), expectedOrderInformation.getName());
        Assertions.assertEquals(order.getPrice(), expectedOrderInformation.getPrice());
    }

    // Negative flow
    @Test
    public void getOrderByIdNegativeFlow() {
        Order order = Order.builder().id(1L).name("Test Order").price(150.0).build();
        when(orderRepository.getOrderById(order.getId())).thenReturn(order);
        Order expectedOrderInformation = orderService.getOrderById(1L);
        Assertions.assertNotNull(expectedOrderInformation);
    }
}
