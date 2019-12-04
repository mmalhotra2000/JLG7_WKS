package edu.gyansetu.tcs.datastructures;

import java.util.*;
import java.lang.*;

import java.util.*;
import java.lang.*;

public class TaskRunnerTester {
	public static void main(String args[]) {
		final String inString = "a,b,c,d,e";
		final String[] splitStrings = new String[5];
		new TaskRunner(new Runnable() {
			@Override
			public void run() {
				int i = 0;
				for (String s : inString.split(",")) {
					splitStrings[i++] = s;
				}
			}
		}).execute();

	
		
		for (String s : splitStrings) {
			System.out.println(s);
		}
	}
}

class TaskRunner {
	Runnable mRunnable;

	public TaskRunner(Runnable runnable) {
		mRunnable = runnable;
	}

	public void execute() {
		new Thread(mRunnable).start();
	}
}