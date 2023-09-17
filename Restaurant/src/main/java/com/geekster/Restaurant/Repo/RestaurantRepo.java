package com.geekster.Restaurant.Repo;

import com.geekster.Restaurant.Entity.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;
@Repository
public class RestaurantRepo {
    @Autowired
   private  Map<Integer, Restaurant> Restaurantmap;

    public Map<Integer,Restaurant> getRestaurantmap(){
        return Restaurantmap;
    }
}

