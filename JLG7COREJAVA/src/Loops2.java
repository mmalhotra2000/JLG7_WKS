
public class Loops2 {

	public static void main(String[] args) {

		for (int i = 1; i < 5; i++) {

			if (i % 3 == 0) {
				break;
			}
			System.out.println("val is " + i);
		}

		// *****
		// *****
		// *****
		// *****

		outer: for (int i = 1; i < 5; i++) {

			inner: for (int j = 0; j < 5; j++) {
				if (i % 3 == 0) {
					break outer;
				}
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
