package com.example.jlg7.SpringBootProjectForJLG7;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public String welcome() {
		return "welcome";
	}

	@RequestMapping("/showform.do")
	public String displayForm() {
		return "helloworld-form";
	}

	@RequestMapping("/processform.do")
	public String processForm() {
		return "helloworld";
	}

	@RequestMapping("/processformv2.do")
	public String processFormv2(HttpServletRequest htttpReq, Model model) {

		String name = htttpReq.getParameter("sname");
		name = name.toUpperCase();

		model.addAttribute("myuppername", name);

		return "helloworld";
	}

}
