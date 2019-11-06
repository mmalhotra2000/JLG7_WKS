
public class Loops {

	public static void main(String[] args) {

		// For loop
		int count = 0;

		for (; count < 5;) {
			System.out.println("value of count is " + count);
			count = count + 1;
		}

		int count1 = 0;

		while (count1 < 5) {
			System.out.println("value of count1 is " + count1);
			count1++;
		}

		int count2 = 5;

		do {
			System.out.println("value of count is " + count2);
			count2--;
		} while (count2 > 0);

	}

}
