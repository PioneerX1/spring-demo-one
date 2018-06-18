package com.pioneerx1.springdemo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// constructor injection for fortuneService
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 min on batting practice";
	}

	@Override
	public String getDailyFortune() {		
		return fortuneService.getFortune();
	}
}
