package com.codeclan.example.deliciousdelightsservice.repositories;
import com.codeclan.example.deliciousdelightsservice.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
