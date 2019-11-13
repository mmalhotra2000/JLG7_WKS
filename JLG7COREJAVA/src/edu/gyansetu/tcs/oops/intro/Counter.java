package edu.gyansetu.tcs.oops.intro;

public class Counter {

	static int count = 0;

	void increment() {
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		Counter counter1 = new Counter();
		Counter counter2 = new Counter();
		Counter counter3 = new Counter();

		counter1.increment();
		counter2.increment();
		counter3.increment();
		//The static field Counter.count should be accessed in a static way
		System.out.println(counter1.count);
		System.out.println(Counter.count);

	}

}
