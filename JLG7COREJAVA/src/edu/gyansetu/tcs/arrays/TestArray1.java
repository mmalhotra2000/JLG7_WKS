package edu.gyansetu.tcs.arrays;

public class TestArray1 {

	public static void main(String[] args) {

		char[] name = { 'm', 'o', 'h' };

		String str = "mohit";
		// 

		// reverse
		
		
		
		

		String revStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}
		System.out.println(revStr);

		char[] strA = new char[str.length()];

		for (int i = 0; i < strA.length; i++) {
			strA[i] = str.charAt(i);
		}

		for (int i = 0; i < strA.length; i++) {
			System.out.println(strA[i]);
		}
	}

}
