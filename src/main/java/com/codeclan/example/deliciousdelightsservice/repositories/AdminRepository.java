package com.codeclan.example.deliciousdelightsservice.repositories;

import com.codeclan.example.deliciousdelightsservice.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
}
