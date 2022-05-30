package com.springdemo;

public class CyclingCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public CyclingCoach() {
		System.out.println("Cycling coach and stuff");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public CyclingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "20 minutes of intense workout";
	}

	@Override
	public String getDailyFortune() {
		return "un petit caraf" + fortuneService.getFortune();
	}
}
