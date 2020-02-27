package com.bb.spring.core.test;

public class BaseBallCoach implements Coach {

	private FortuneService fortuneService;
	private int id;

	public BaseBallCoach() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public BaseBallCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}


	public BaseBallCoach(FortuneService fortuneService, int id) {
		super();
		this.fortuneService = fortuneService;
		this.id = id;
	}

	@Override
	public String getDailyWorkout() {
		return "DO 20 push ups";
	}

	public String getResultFromFortuneService() {
		return fortuneService.getService();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	

}
