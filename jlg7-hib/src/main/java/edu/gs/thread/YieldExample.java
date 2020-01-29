package edu.gs.thread;

import java.util.ArrayList;

public class YieldExample {
	public static void main(String[] args) {
		// a=5;
		// b =++a;
		// a++
		// a=a+1;
		// c = add(a,b);

		// load a
		// load b
		// add a and b
		// store c

		// ArrayList<Integer> arrayList = new Arr
		Thread producer = new Producer();
		Thread consumer = new Consumer();

		producer.setPriority(Thread.MIN_PRIORITY); // Min Priority
		consumer.setPriority(Thread.MAX_PRIORITY); // Max Priority

		producer.start();
		consumer.start();

	}
}

class Producer extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("I am Producer : Produced Item " + i);
			Thread.yield();
		}

	}
}

class Consumer extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("I am Consumer : Consumed Item " + i);
			Thread.yield();
		}
	}
}