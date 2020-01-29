package edu.gs.thread;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Worker {

	public synchronized void work() {
		String name = Thread.currentThread().getName();
		String fileName = name + ".txt";

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
			writer.write("Thread " + name + " wrote this mesasge");
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		while (true) {
			System.out.println(name + " is working");

			try {
				wait(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class StarvationExample {
	public static void main(String[] args) {
		final Worker worker = new Worker();
		for (int i = 0; i < 10; i++) {
			new Thread(new Runnable() {
				public void run() {
					worker.work();
				}
			}).start();
		}
	}
}