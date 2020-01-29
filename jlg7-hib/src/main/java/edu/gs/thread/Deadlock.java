package edu.gs.thread;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

class Developer {

	public synchronized void fixBugs() {
		System.out.println("Fixing bugs..");
	}

	public synchronized void code() {
		System.out.println("Coding..");
	}
}

class Tester {
	public synchronized void testAppIn() {
		System.out.println("Testing..");
	}
}

/**
 * Already developed , Hence first testing then fix bugs by dev team
 * 
 * @author momalhotra
 * 
 */
class AndroidApp implements Runnable {
	Developer developer;
	Tester tester;

	/**
	 * @param developer
	 * @param tester
	 */
	public AndroidApp(Developer developer, Tester tester) {
		super();
		this.developer = developer;
		this.tester = tester;
	}

	public void run() {
		synchronized (tester) {
			tester.testAppIn();
			developer.fixBugs();
		}
	}

}

/**
 * Starting development , then will be given to testing team
 * 
 * @author momalhotra
 * 
 */
class IphoneApp implements Runnable {
	Developer developer;
	Tester tester;

	/**
	 * @param developer
	 * @param tester
	 */
	public IphoneApp(Developer developer, Tester tester) {
		super();
		this.developer = developer;
		this.tester = tester;
	}

	public void run() {
		synchronized (developer) {
			developer.code();
			tester.testAppIn();
		}
	}

}

public class Deadlock {
	public static void main(String[] args) {
		Developer mohit = new Developer();
		Tester neeti = new Tester();

		Thread iphoneApp = new Thread(new IphoneApp(mohit, neeti));
		Thread androidApp = new Thread(new AndroidApp(mohit, neeti));

		iphoneApp.start();
		
		androidApp.start();

		ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
		long[] ids = threadMXBean.findMonitorDeadlockedThreads();
		ThreadInfo[] threadInfos = threadMXBean.getThreadInfo(ids);

		for (ThreadInfo info : threadInfos) {
			System.out.println(info);
		}
	}
	
	


}
