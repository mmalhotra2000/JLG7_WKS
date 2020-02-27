package com.bb.spring.core.test;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDAOSQLImpl implements EmployeeDAO{

	@Override
	public void save() {
		System.out.println("EmployeeDAOSQLImpl:: save");
	}
	@Override
	public void save1() {
		System.out.println("EmployeeDAOSQLImpl:: save");
	}
	@Override
	public void save2() {
		System.out.println("EmployeeDAOSQLImpl:: save");
	}
	@Override
	public void save3() {
		System.out.println("EmployeeDAOSQLImpl:: save");
	}
	@Override
	public void save4() {
		System.out.println("EmployeeDAOSQLImpl:: save");
	}
}
