package com.example.demo;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AssignmentDay8OnlineFoodOrderingSystemApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		FoodOrderService orderService = ac.getBean(FoodOrderService.class);
		orderService.processOrder();
				
		}

}
