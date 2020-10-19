package com.codeclan.example.deliciousdelightsservice.repositories;

import com.codeclan.example.deliciousdelightsservice.models.DebitCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebitCardRepository extends JpaRepository<DebitCard, Long> {
}
