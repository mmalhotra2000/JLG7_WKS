package edu.gyansetu.tcs.datastructures;

public class MyLinkedList {

	private MyNode start;
	private int size = 0;

	class MyNode {
		MyNode prev;
		Object data;
		MyNode next;

		public MyNode(Object data) {
			this.data = data;
		}

	}

	public MyLinkedList() {
		start = new MyNode(null);
	}

	public void add(Object data) {
		MyNode myNode = new MyNode(data);
		MyNode p = start;
		for (; p.next != null; p = p.next) {
		}
		p.next = myNode;
		myNode.prev = p;
		size++;
	}

	public Object[] toArray() {
		Object[] objects = new Object[size];
		int i = 0;
		for (MyNode p = start.next; p!= null; p = p.next) {
			objects[i] = p.data;
			i++;
		}
		return objects;
	}

}
