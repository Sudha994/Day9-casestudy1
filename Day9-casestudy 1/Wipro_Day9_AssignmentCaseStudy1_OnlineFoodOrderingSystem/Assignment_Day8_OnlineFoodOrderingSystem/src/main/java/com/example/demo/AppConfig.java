package com.example.demo;


import java.util.Arrays;

import org.springframework.context.annotation.Bean;

public class AppConfig {

	 @Bean
	    public Customer customer() {
	        return new Customer("Sanjith Kumar H R", "sanjith.hangala@gmail.com", "South Indian");
	    }
	    
	    @Bean
	    public Restaurant restaurant() {
	        return new Restaurant("Pasta Palace", "Bangalore", 
	            Arrays.asList("North Indian", "South Indian", "Mughlai", "Street Food"));
	    }
	    
	    @Bean
	    public FoodOrderService foodOrderService() {
	        return new FoodOrderService(customer(), restaurant());
	    }
}
