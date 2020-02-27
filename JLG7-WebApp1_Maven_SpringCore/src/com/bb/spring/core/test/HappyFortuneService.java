package com.bb.spring.core.test;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getService() {
		// TODO Auto-generated method stub
		return "HappyFortuneService :: getService ";
	}

}
