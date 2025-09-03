package com.example.demo;

public class FoodOrderService {

	
	private Customer customer;
	
    private Restaurant restaurant;

    public FoodOrderService(Customer customer, Restaurant restaurant) {
        this.customer = customer;
        this.restaurant = restaurant;
    }

    public void processOrder() {
        if (restaurant.servesCuisine(customer.getPreferredCuisine())) {
            System.out.println("Order processed successfully!");
            System.out.println("Customer: " + customer.getName());
            System.out.println("Restaurant: " + restaurant.getName());
            System.out.println("Cuisine: " + customer.getPreferredCuisine());
            System.out.println();
            System.out.println("Customer Details: "+customer.toString());
            System.out.println("Restaurant Details: "+restaurant.toString());
        } else {
            System.out.println("Sorry, the restaurant doesn't serve your preferred Item.");
        }
    }
}
