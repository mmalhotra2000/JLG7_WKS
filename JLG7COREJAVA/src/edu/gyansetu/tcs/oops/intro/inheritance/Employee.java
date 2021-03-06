package edu.gyansetu.tcs.oops.intro.inheritance;

public class Employee {

	protected String name;
	protected String address;
	protected double exp;

	public int commonAttr = 99;
	
	

	public Employee(String name, String address, double exp, int commonAttr) {
		this.name = name;
		this.address = address;
		this.exp = exp;
		this.commonAttr = commonAttr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}

	public int getCommonAttr() {
		return commonAttr;
	}

	public void setCommonAttr(int commonAttr) {
		this.commonAttr = commonAttr;
	}

	public void doCommonThings() {
		System.out.println("From emp ::doCommonThings ");
	}

	public void displayData() {
		System.out.println(" emp is displaying some data");
	}

}
