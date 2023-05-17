package com.example.cardapio.repository;

import com.example.cardapio.domain.FoodDomain;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FoodRepository extends CrudRepository<FoodDomain, UUID> {

}
