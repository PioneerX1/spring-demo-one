package com.pioneerx1.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		// retrieve a bean from spring container
		Coach coach = context.getBean("myCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(coach.getDailyWorkout());
		
		// methods for fortune service
		System.out.println(coach.getDailyFortune());
		
		// close the app context
		context.close();
		
	}

}
