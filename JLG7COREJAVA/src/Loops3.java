
public class Loops3 {

	public static void main(String[] args) {

		for (int i = 1; i <= 6; i++) {

			System.out.println("before cont " + i);

			if (i % 2 == 0) {
				continue;
			}

			System.out.println("after cont " + i);

		}

	}
}
