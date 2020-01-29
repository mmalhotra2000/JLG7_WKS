package edu.gyansetu.tcs.arrays;

class MyInteger {

	int val;

	public MyInteger(int val) {
		super();
		this.val = val;
	}

}

public class WrapperTest1 {

	public static void main(String[] args) {

		MyInteger integer = new MyInteger(34);
		// using cons
		Integer num1 = new Integer(34);

		// autoboxing
		Integer num2 = 78; // ? prim -> Wrapp ?

		Integer num3 = Integer.valueOf(89);

		Integer i1 = 1000;
		Integer i2 = 1000;

		if (i1.equals(i2)) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}

		int numm = num3; // wrapp -? primi
		// .intValue();

		String mobile = "766867868768";
				//"9698698898";

		Integer moNum = Integer.valueOf(mobile);
		// Long.parseLong(mobile);

		if (moNum % 2 == 0) {
			System.out.println("even mob");
		} else {
			System.out.println("odd mob");
		}

	}

}
