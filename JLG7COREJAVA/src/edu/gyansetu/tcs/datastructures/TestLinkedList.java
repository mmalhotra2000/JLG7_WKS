package edu.gyansetu.tcs.datastructures;

import java.util.Arrays;

public class TestLinkedList {

	public static void main(String[] args) {

		MyLinkedList linkedList1 = new MyLinkedList();

		linkedList1.add(new Integer(34));
		linkedList1.add(new Integer(67));
		linkedList1.add(new Integer(78));

		Object[] array = linkedList1.toArray();
		System.out.println(Arrays.toString(array));
		
		

	}

}