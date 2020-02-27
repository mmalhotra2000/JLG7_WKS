package com.bb.spring.mvc.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HelloWorldController {

	//@RequestMapping("/main")
	public String displayHelloPage() {

		return "main-menu";
	}

}
