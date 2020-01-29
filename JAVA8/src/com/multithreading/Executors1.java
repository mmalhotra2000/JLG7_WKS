package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {

	private long count;

	public Task(long count) {
		super();
		this.count = count;
	}

	@Override
	public void run() {
		System.out.println("Connect with IO by thread " + count);
	}

}

public class Executors1 {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);

		for (int i = 0; i < 100; i++) {
			executorService.execute(new Task(i));
		}

		executorService.shutdown();

		System.out.println("Done");
	}

}
