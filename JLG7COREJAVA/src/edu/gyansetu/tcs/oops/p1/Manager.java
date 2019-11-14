package edu.gyansetu.tcs.oops.p1;

import edu.gyansetu.tcs.oops.intro.inheritance.Employee;

public class Manager extends Employee {

	public int teamSize; // default : package private

	public void reportProjectStatus() {
		
		System.out.println("reportProjectStatus");
	}

	
	public void displayData() {
		System.out.println(" Manager is displaying some data");
	}
}