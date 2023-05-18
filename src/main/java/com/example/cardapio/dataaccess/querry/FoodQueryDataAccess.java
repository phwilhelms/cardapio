package com.example.cardapio.dataaccess.querry;

import com.example.cardapio.dto.FoodResponseDto;
import com.example.cardapio.repository.FoodRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FoodQueryDataAccess {

    private final FoodRepository foodRepository;

    public FoodQueryDataAccess(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public List findAllFood() {
        return this.foodRepository.findAll().stream().map(FoodResponseDto::new).toList();
    }
}
