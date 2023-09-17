package com.geekster.Restaurant.Repo;

import com.geekster.Restaurant.Entity.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;
@Configuration
public class DataSource {
    @Bean
    Map<Integer,Restaurant> getSource(){
        return new HashMap<>();
    }
}
