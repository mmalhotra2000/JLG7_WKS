package edu.gyansetu.tcs.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Remote {

	private int id;
	private int numOfChannels;
	private double price;

	public Remote(int id, int numOfChannels, double price) {
		super();
		this.id = id;
		this.numOfChannels = numOfChannels;
		this.price = price;
	}

	public Remote() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumOfChannels() {
		return numOfChannels;
	}

	public void setNumOfChannels(int numOfChannels) {
		this.numOfChannels = numOfChannels;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Remote [id=" + id + ", numOfChannels=" + numOfChannels + ", price=" + price + "]";
	}

}

public class TestArrayList6 {

	public static void main(String[] args) {
		Remote remote1 = new Remote(23, 12, 453.55);
		Remote remote2 = new Remote(53, 16, 3553.55);
		Remote remote3 = new Remote(90, 23, 86786.55);
		Remote remote4 = new Remote(23, 15, 768.55);
		Remote remote5 = new Remote(34, 90, 887.55);
		Remote remote6 = new Remote(23, 56, 453.55);

		ArrayList<Remote> remoteList = new ArrayList<Remote>(6);

		remoteList.add(remote1);
		remoteList.add(remote2);
		remoteList.add(remote3);
		remoteList.add(remote4);
		remoteList.add(remote5);
		remoteList.add(remote6);

		System.out.println("before sorting");
		remoteList.forEach(System.out::println);

		// sort on the basis of id asc
		// Collections.sort(remotes,Comparator.comparing(Remote::getId));

		// sort on the basis of id desc
		//Collections.sort(remotes, Comparator.comparing(Remote::getId).reversed());
		
		Collections.sort(remoteList, Comparator.comparing(Remote::getId).thenComparing(Remote::getPrice));

		System.out.println("after sorting");
		remoteList.forEach(System.out::println);

		// before sorting
		// Remote [id=23, numOfChannels=12, price=453.55]
		// Remote [id=53, numOfChannels=16, price=3553.55]
		// Remote [id=90, numOfChannels=23, price=86786.55]
		// Remote [id=23, numOfChannels=15, price=768.55]
		// Remote [id=34, numOfChannels=90, price=887.55]
		// Remote [id=23, numOfChannels=56, price=453.55]
		// after sorting
		// Remote [id=23, numOfChannels=12, price=453.55]
		// Remote [id=23, numOfChannels=15, price=768.55]
		// Remote [id=23, numOfChannels=56, price=453.55]
		// Remote [id=34, numOfChannels=90, price=887.55]
		// Remote [id=53, numOfChannels=16, price=3553.55]
		// Remote [id=90, numOfChannels=23, price=86786.55]

//		
//		before sorting
//		Remote [id=23, numOfChannels=12, price=453.55]
//		Remote [id=53, numOfChannels=16, price=3553.55]
//		Remote [id=90, numOfChannels=23, price=86786.55]
//		Remote [id=23, numOfChannels=15, price=768.55]
//		Remote [id=34, numOfChannels=90, price=887.55]
//		Remote [id=23, numOfChannels=56, price=453.55]
//		after sorting
//		Remote [id=90, numOfChannels=23, price=86786.55]
//		Remote [id=53, numOfChannels=16, price=3553.55]
//		Remote [id=34, numOfChannels=90, price=887.55]
//		Remote [id=23, numOfChannels=12, price=453.55]
//		Remote [id=23, numOfChannels=15, price=768.55]
//		Remote [id=23, numOfChannels=56, price=453.55]
		
		//
		// Remote [id=23, numOfChannels=12, price=453.55]
		// Remote [id=23, numOfChannels=15, price=768.55]
		// Remote [id=23, numOfChannels=56, price=453.55]
		// Remote [id=34, numOfChannels=90, price=887.55]
		// Remote [id=53, numOfChannels=16, price=3553.55]
		// Remote [id=90, numOfChannels=23, price=86786.55]

		
		
	}

}