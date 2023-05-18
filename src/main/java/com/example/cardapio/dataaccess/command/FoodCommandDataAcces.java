package com.example.cardapio.dataaccess.command;

import com.example.cardapio.domain.FoodDomain;
import com.example.cardapio.dto.FoodRequestDto;
import com.example.cardapio.repository.FoodRepository;
import org.springframework.stereotype.Component;

@Component
public class FoodCommandDataAcces {

    private final FoodRepository foodRepository;

    public FoodCommandDataAcces(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public void saveFood(FoodRequestDto foodRequestDto) {
        FoodDomain foodDomain = new FoodDomain(foodRequestDto);
        this.foodRepository.save(foodDomain);
    }
}
