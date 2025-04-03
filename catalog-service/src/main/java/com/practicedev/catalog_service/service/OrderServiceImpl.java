package com.practicedev.catalog_service.service;

import com.practicedev.catalog_service.entity.Order;
import com.practicedev.catalog_service.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements  OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository){
        this.orderRepository=orderRepository;
    }

    @Override
    public List<Order> getAllOrders() {
        return  orderRepository.findAll();
    }

    @Override
    public List<Order> getOrdersByCategory(String category) {
        return  orderRepository.findByCategory(category);
    }
}
