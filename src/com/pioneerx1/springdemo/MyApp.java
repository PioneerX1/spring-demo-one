package com.pioneerx1.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		// create the coach object
		Coach coach = new TrackCoach();
		
		// use the coach object
		System.out.println(coach.getDailyWorkout());
	}

}
