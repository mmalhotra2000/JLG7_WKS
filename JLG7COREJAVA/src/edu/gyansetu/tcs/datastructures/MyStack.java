package edu.gyansetu.tcs.datastructures;

import java.util.ArrayList;

public class MyStack {

	// array
	// ll
	
	// push 
	// pop
	// peek
	
	// amit  3
	// sumit 2
	// rohit 1
	// mohit 0 
	
	private ArrayList<Object> data;
	
	public MyStack() {
		data = new ArrayList<Object>(1);
	}
	
	public void push(Object ele) {
		data.add(ele);
	}
	
	public Object pop() {
		return data.remove(data.size()-1);
	}
	
//	public Object peek() {
//		
//	}
	
	
	
}
