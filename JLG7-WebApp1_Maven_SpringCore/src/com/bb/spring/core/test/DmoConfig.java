package com.bb.spring.core.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.bb.spring")
public class DmoConfig {
	
	@Bean
	public Book book() {
		return new Book(12, "Mohit");
	}

}
