package com.pioneerx1.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public TrackCoach() { 
		// no-arg constructor
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run 20 min and stretch";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();
	}

}
