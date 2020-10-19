package com.codeclan.example.deliciousdelightsservice.repositories;
import com.codeclan.example.deliciousdelightsservice.models.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
}
