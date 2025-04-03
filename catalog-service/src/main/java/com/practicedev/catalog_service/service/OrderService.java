package com.practicedev.catalog_service.service;

import com.practicedev.catalog_service.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAllOrders();
    List<Order> getOrdersByCategory(String category);
}
