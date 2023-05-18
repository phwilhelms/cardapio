package com.example.cardapio.service;

import com.example.cardapio.dataaccess.querry.FoodQueryDataAccess;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindFoodService {

    private final FoodQueryDataAccess foodQueryDataAccess;

    public FindFoodService(FoodQueryDataAccess foodQueryDataAccess) {
        this.foodQueryDataAccess = foodQueryDataAccess;
    }

    public List execute() {
        return this.foodQueryDataAccess.findAllFood();
    }
}
