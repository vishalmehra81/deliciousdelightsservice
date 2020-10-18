package com.codeclan.example.deliciousdelightsservice.repositories;

import com.codeclan.example.deliciousdelightsservice.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
