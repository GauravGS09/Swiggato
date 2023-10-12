package com.example.Swiggato.service;

import com.example.Swiggato.dto.request.RestaurantRequest;
import com.example.Swiggato.dto.response.RestaurantResponse;
import com.example.Swiggato.model.Restaurant;
import com.example.Swiggato.repository.RestaurantRespository;
import com.example.Swiggato.transformer.RestaurantTransformer;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {
    final RestaurantRespository restaurantRespository;

    public RestaurantService(RestaurantRespository restaurantRespository) {
        this.restaurantRespository = restaurantRespository;
    }

    public RestaurantResponse addRestaurant(RestaurantRequest restaurantRequest) {
        //dto --> model
        Restaurant restaurant = RestaurantTransformer.RestaurantRequestToRestaurant(restaurantRequest);
        //persist/save the model in db
        Restaurant savedRestaurant = restaurantRespository.save(restaurant);
        // prepare response dto from model
        return RestaurantTransformer.RestaurantToRestaurantResponse(savedRestaurant);

    }
}
