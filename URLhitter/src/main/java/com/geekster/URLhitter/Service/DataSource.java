package com.geekster.URLhitter.Service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class DataSource {

 @Bean
 Map<String,Integer> getSource(){ return new HashMap<>(); }
}
