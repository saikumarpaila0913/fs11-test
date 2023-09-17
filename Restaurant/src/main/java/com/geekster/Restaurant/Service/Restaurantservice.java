package com.geekster.Restaurant.Service;

import com.geekster.Restaurant.Entity.Restaurant;
import com.geekster.Restaurant.Repo.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class Restaurantservice {
    @Autowired
    RestaurantRepo RestRepo;


    //-get Restaurant by id using GetMapping.
    public Restaurant getrestaurantById(Integer Id){
        return RestRepo.getRestaurantmap().get(Id);
    }
    //-get all Reataurant using  GetMapping
     public Map<Integer,Restaurant> getAll(){
        return RestRepo.getRestaurantmap();
     }
    //-Add some Restaurant to Restaurant lists using PostMapping
    public String AddRest(Restaurant newrest ){
        RestRepo.getRestaurantmap().put(newrest.getRestaurantId(),newrest);
        return "added";
    }
    //-update Restaurant information like Specialty.
    public String Update(Integer Id,Restaurant restaurant){
        RestRepo.getRestaurantmap().put(Id,restaurant);
        return "Updated";
    }
    //-delete Restaurant from the list.
    public String Removerest(Integer Id){
        RestRepo.getRestaurantmap().remove(Id);
        return "Deleted";
    }

}
