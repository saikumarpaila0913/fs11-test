package com.geekster.Restaurant.Controller;

import com.geekster.Restaurant.Entity.Restaurant;
import com.geekster.Restaurant.Service.Restaurantservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class Controller {

    @Autowired
    Restaurantservice restaurantservice;


       //-get Restaurant by id using GetMapping.
    @GetMapping("/{Id}")
    public Restaurant getrestById(@PathVariable Integer Id){
           return restaurantservice.getrestaurantById(Id);
    }
       //     -get all Reataurant using  GetMapping
    @GetMapping("/Restaurants")
    public Map<Integer,Restaurant> getAll(){
        return restaurantservice.getAll();
    }
       //-Add some Restaurant to Restaurant lists using PostMapping
    @PostMapping("/Restaurant")
    public String Addrest(@RequestBody Restaurant Newrest){
        return restaurantservice.AddRest(Newrest);
    }
       //-update Restaurant information like Specialty.
    @PutMapping("/restaurant")
    public String Updaterest(@RequestParam Integer Id,@RequestBody Restaurant restaurant){
        return restaurantservice.Update(Id,restaurant);
    }
       //-delete Restaurant from the list.
    @DeleteMapping("/rest")
    public String remove(@RequestParam Integer Id){
        return restaurantservice.Removerest(Id);
    }
}
