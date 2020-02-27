package com.bb.spring.core.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tennis_abc_Coach implements Coach {

	private FortuneService fortuneService;

	public Tennis_abc_Coach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "TennisCoach::getDailyWorkout";
	}

	public String getResultFromFortuneService() {
		return fortuneService.getService();
	}

}
