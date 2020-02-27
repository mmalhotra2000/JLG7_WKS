package com.bb.spring.core.test;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TestServlet {

	private EmployeeDAO employeeDAO;

	public TestServlet(@Qualifier("employeeDAOSQLImpl") EmployeeDAO employeeDAO) {
		super();
		this.employeeDAO = employeeDAO;

		System.out.println("I am cons");
	}

	@PostConstruct
	public void init() {
		System.out.println("I am doing initial...");
	}

	public void doPost(String httpReq, String httpResp) {
		employeeDAO.save();
	}

	public void doPost1(String httpReq, String httpResp) {
		employeeDAO.save1();
	}

	public void doPost2(String httpReq, String httpResp) {
		employeeDAO.save2();
	}

	public void doPost3(String httpReq, String httpResp) {
		employeeDAO.save3();
	}

	public void doPost4(String httpReq, String httpResp) {
		employeeDAO.save4();
	}

	public void doPost5(String httpReq, String httpResp) {
		employeeDAO.save();
	}

	@PreDestroy
	public void destroty() {
		System.out.println("I am doing cleanup...");

	}

}
