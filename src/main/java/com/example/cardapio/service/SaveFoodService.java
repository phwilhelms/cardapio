package com.example.cardapio.service;

import com.example.cardapio.dataaccess.command.FoodCommandDataAcces;
import com.example.cardapio.dto.FoodRequestDto;
import com.example.cardapio.dto.FoodResponseDto;
import org.springframework.stereotype.Service;

@Service
public class SaveFoodService {

    private final FoodCommandDataAcces foodCommandDataAcces;

    public SaveFoodService(FoodCommandDataAcces foodCommandDataAcces) {
        this.foodCommandDataAcces = foodCommandDataAcces;
    }

    public void execute(FoodRequestDto data) {
        this.foodCommandDataAcces.saveFood(data);
    }
}
