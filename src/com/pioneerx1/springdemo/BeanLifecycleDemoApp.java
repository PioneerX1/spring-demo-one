package com.pioneerx1.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		
		// retrieve beans from container
		Coach coach = context.getBean("myCoach", Coach.class);
		
		// App output should be surrounded by output from init and destroy methods
		System.out.println(coach.getDailyWorkout());
		
		// close context
		context.close();

	}

}
