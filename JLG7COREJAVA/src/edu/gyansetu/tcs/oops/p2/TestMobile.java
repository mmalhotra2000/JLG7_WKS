package edu.gyansetu.tcs.oops.p2;

public class TestMobile {
	public static void main(String[] args) {
		
		
		Windows windows = new Mobile();
		
		windows.installMSOffice();
		
		Mobile mobile = (Mobile) windows;
		
		mobile.installPlaystore();
		
		
	}

}
