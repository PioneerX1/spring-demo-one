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
	
	// custom hook for spring init-method
	public void doStartUp() {
		System.out.println("TrackCoach: do my STARTUP stuff");
	}
	
	// custom hook for spring destory-method
	public void doCleanUp() {
		System.out.println("TrackCoach: do my CLEANUP stuff");
	}

}
