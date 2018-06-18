package com.pioneerx1.springdemo;

public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	// need no-arg constructor since using setter injection
	public FootballCoach() {
		System.out.println("FootballCoach inside no-arg constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Throw the pigskin 100 times";
	}

	@Override
	public String getDailyFortune() {
		return "Football rah rah: " + fortuneService.getFortune();
	}
	
	// setter injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("FootballCoach inside setter method");
		this.fortuneService = fortuneService;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}
	
	public String getTeam() {
		return team;
	}

}
