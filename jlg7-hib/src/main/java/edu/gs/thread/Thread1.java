package edu.gs.thread;

class Sing extends Thread {

	Thread playThread;

	public Sing(Thread playThread) {
		super();
		this.playThread = playThread;
	}

	@Override
	public void run() {
		try {
			playThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Sing thread running");
	}
}

class Play implements Runnable {

	public void run() {

		System.out.println("I am playing with DB");
	}

}

class SleepyThread implements Runnable {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class Thread1 {

	public static void main(String[] args) {

		Thread th1 = new Thread(new Play()); // new state

		Thread singTh = new Sing(th1); // new state

		System.out.println("entry main");

		singTh.start();

		th1.start();
		// th1.start();

		// getPatDetails() : 100 threads

		// th1.start();

		try {
			singTh.join();
			th1.join(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Thread sleepyTh = new Thread(new SleepyThread());

		sleepyTh.start();
		
		try {
			sleepyTh.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		System.out.println("Exit main");

	}

}
