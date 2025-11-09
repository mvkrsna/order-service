package com.techbud.orderService.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Order {
    Long id;
    String name;
    Double price;
}
