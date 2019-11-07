
public class Method1 {

	public static void main(String[] args) {

		int res = add(2, 3, -3);
		System.out.println("res is " + res);

	}

	static int add(int x, int y) {
		int c = x + y;
		return c;
	}

//	static double add(int x, int y) {
//		int c = x + y;
//		return 3.45;
//	}

	static int add(int x, int y, int z) {
		int c = x + y;
		return c;
	}

}
