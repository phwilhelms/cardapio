package com.example.cardapio.dto;

import com.example.cardapio.domain.FoodDomain;

import java.util.UUID;

public record FoodResponseDto (UUID id, String title, String image, Double price) {

    public FoodResponseDto(FoodDomain foodDomain){
        this(foodDomain.getId(), foodDomain.getTitle(), foodDomain.getImage(), foodDomain.getPrice());
    }
}
