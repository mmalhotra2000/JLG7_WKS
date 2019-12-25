package edu.gyansetu.tcs.string.revision;

public class TestString1 {

	public static void main(String[] args) {

		// char[] name = {'m','o'};

		String name = "Mohit"; // M->0, o->1
		// 01234
		String lastName = new String("Malhotra");

		// methods
		int index = name.indexOf('h');
		System.out.println("index of  h is " + index);

		String str1 = "mohonhi";
		System.out.println(str1.indexOf('o', 2));

		// charAt()

		char c1 = str1.charAt(5);
		System.out.println(c1);

		for (int i = 0; i < str1.length(); i++) {
			System.out.println(str1.charAt(i));
		}

		// after upper case
		// mohonhi
		// immutable
		//
		// orphan 1000 : ("mohonhi")
		// 2000 : ("MOHONHI")
		System.out.println("after upper case");
		str1 = str1.toUpperCase();

		System.out.println(str1);

		// String str2 = "abc";
		// String str3 = "abc";

		String str2 = new String("abc");
		String str3 = new String("abc");

		if (str2.equals(str3)) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		String adderss = "gh-1/387 paschim vihar";
		
		if (adderss.startsWith("g")) {
			System.out.println("yes");
		}

		
		// substring
		
		String modAddress  = adderss.substring(adderss.length()-3, adderss.length()); // start - (end-1)
		System.out.println("last three "+modAddress);
		
		// reverse
		// amama after same 
		// 1010101
		// DEF: FED, EFD
		// Mohit : m o  , mo om :DP
	}

}
