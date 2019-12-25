package edu.gyansetu.tcs.reflection;

import edu.gyansetu.tcs.oops.p2.Windows;

@MyTable(name = "ecap_bag")
public class Bag implements Comparable<Bag> , Windows{

	private int id;
	private String name;

	public int price;

	public static String type;

	public Bag() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bag(String name) {
		super();
		this.name = name;
	}

	public Bag(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Bag(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Bag [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Bag o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void installMSOffice() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static String getType() {
		return type;
	}

	public static void setType(String type) {
		Bag.type = type;
	}
	
	
	public static int checkPrice(Integer per) {
		return per;
	}

}
