package com.codeclan.example.deliciousdelightsservice.repositories;

import com.codeclan.example.deliciousdelightsservice.models.BreadAndRice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BreadAndRiceRepository extends JpaRepository<BreadAndRice, Long> {
}
