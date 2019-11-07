
public class Factorial {

	public static void main(String[] args) {
		
		int res  = fact(5);
		System.out.println("res is "+res);

	}

	static int fact(int n) {
		if(n==1) {
			return 1;
		}
		return n * fact(n - 1);
	}

}
