package edu.gyansetu.tcs.oops.p1;

import edu.gyansetu.tcs.oops.intro.inheritance.Employee;

public class Programmer extends Employee {

	private int numOfLangKnown;

	public int commonAttr = 999;
	
	
	

	public Programmer(String name, String address, double exp, int commonAttr) {
		super(name, address, exp, commonAttr);
		// TODO Auto-generated constructor stub
	}

	public int getCommonAttr() {
		return super.commonAttr;
	}

	public void setCommonAttr(int commonAttr) {
		this.commonAttr = commonAttr;
	}

	public int getNumOfLangKnown() {
		return numOfLangKnown;
	}

	public void setNumOfLangKnown(int numOfLangKnown) {
		this.numOfLangKnown = numOfLangKnown;
	}

}
