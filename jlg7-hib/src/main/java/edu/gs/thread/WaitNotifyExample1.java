package edu.gs.thread;

class Pen {

}

class Studentt extends Thread {
	Pen pen;

	public Studentt(Pen pen) {
		this.pen = pen;
	}

	@Override
	public void run() {
		System.out.println(String.format("%s Doing some work with pen ", this.getName()));
		System.out.println(String.format("%s Going to wait for pen ", this.getName()));
		synchronized (pen) {
			try {
				pen.notify();
				pen.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(String.format("%s Wait over again using pen", this.getName()));
	}
}

public class WaitNotifyExample1 {
	public static void main(String[] args) {
		Pen pen = new Pen();
		Thread st1 = new Thread(new Studentt(pen));
		Thread st2 = new Thread(new Studentt(pen));
		st1.start();
		st2.start();
		
		try {
			st1.join();
			st2.join();
			//Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		synchronized (pen) {
			
			pen.notify();
		}
	}
}