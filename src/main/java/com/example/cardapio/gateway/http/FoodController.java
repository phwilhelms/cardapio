package com.example.cardapio.gateway.http;

import com.example.cardapio.dto.FoodRequestDto;
import com.example.cardapio.service.FindFoodService;
import com.example.cardapio.service.SaveFoodService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    private final FindFoodService findFoodService;

    private final SaveFoodService saveFoodService;

    public FoodController(FindFoodService findFoodService, SaveFoodService saveFoodService) {
        this.findFoodService = findFoodService;
        this.saveFoodService = saveFoodService;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List getAll() {
        return this.findFoodService.execute();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/new")
    public ResponseEntity saveFood(@RequestBody FoodRequestDto data) {
        this.saveFoodService.execute(data);
        return new ResponseEntity(data, HttpStatus.OK);
    }
}
