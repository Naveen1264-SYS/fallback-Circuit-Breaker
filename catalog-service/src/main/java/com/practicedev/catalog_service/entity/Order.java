package com.practicedev.catalog_service.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orders_table")
@Data
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Ensure correct generation strategy for id
    private Long id;

    private String name;
    private String category;
    private String color;
    private double price;

    public Order(String name, String category, String colour, double price) {
        this.name = name;
        this.category = category;
        this.color = colour;
        this.price = price;
    }
}
