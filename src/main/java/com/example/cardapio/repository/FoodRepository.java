package com.example.cardapio.repository;

import com.example.cardapio.domain.FoodDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FoodRepository extends JpaRepository<FoodDomain, UUID> {

}
