package edu.gyansetu.tcs.oops.p1;

import edu.gyansetu.tcs.oops.intro.inheritance.Employee;

public class Manager extends Employee {

	public Manager(String name, String address, double exp, int commonAttr) {
		super(name, address, exp, commonAttr);
		// TODO Auto-generated constructor stub
	}


	public int teamSize; // default : package private
	
	
	

	public int getTeamSize() {
		return teamSize;
	}


	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}


	


	public void reportProjectStatus() {
		
		System.out.println("reportProjectStatus");
	}

	
	public void displayData() {
		System.out.println(" Manager is displaying some data");
	}
}
