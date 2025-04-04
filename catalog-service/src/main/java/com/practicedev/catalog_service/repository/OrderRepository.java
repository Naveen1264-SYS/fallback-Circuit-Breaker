package com.practicedev.catalog_service.repository;

import com.practicedev.catalog_service.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long> {
    List<Order> findByCategory(String category);

}
