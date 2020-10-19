package com.codeclan.example.deliciousdelightsservice.repositories;

import com.codeclan.example.deliciousdelightsservice.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
