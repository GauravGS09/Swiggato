package com.example.Swiggato.transformer;

import com.example.Swiggato.dto.response.FoodResponse;
import com.example.Swiggato.model.FoodItem;

public class FoodItemTransformer {
    public static FoodResponse FoodToFoodResponse(FoodItem food){
        return FoodResponse.builder()
                .dishName(food.getDishName())
                .price(food.getPrice())
                .category(food.getCategory())
                .veg(food.isVeg())
                .build();
    }
}
