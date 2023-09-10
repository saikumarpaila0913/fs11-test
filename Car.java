package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Car {
    String color;
    @Bean
   public void setcolor(){
        this.color="black";
    }

}
