package com.example.jlg7.SpringBootProjectForJLG7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.jlg7.SpringBootProjectForJLG7.entity.Student;
import com.example.jlg7.SpringBootProjectForJLG7.entity.StudentRepository;

@Controller
@RequestMapping("/student")
public class StudentController {

	private StudentRepository studentRepository;

	public StudentController(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@RequestMapping("/showstdform.do")
	public String showStdForm(Model model) {
		model.addAttribute("stdObj", new Student("def", "def"));
		return "std-form";
	}

	@RequestMapping("/register.do")
	public String registerAndConfirm(@ModelAttribute("stdObj") Student std, Model model) {

		System.out.println("model attr :" + std);
		System.out.println("old model attr :" + model.getAttribute("stdObj"));

		std = studentRepository.save(std);
		model.addAttribute("stdObj", std);
		return "std-confirmation";

	}
}
