package com.pioneerx1.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve beans from container
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		Coach betaCoach = context.getBean("myCoach", Coach.class);
		
		// check if these coach objects are pointing to the same bean, same place in memory
		boolean result = (alphaCoach == betaCoach);
		
		// print result
		System.out.println("------");
		System.out.println("Pointing to the same object? " + result);
		System.out.println("Memory location for alphaCoach: " + alphaCoach);
		System.out.println("Memory location for betaCoach: " + betaCoach);
		
		// close context
		context.close();

	}

}
