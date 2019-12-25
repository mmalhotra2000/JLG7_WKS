package edu.gyansetu.tcs.jdbc;

public class Invoice {

	private int id;
	private int amount;
	private Customer customer;

	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Invoice(int id, int amount, Customer customer) {
		super();
		this.id = id;
		this.amount = amount;
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", amount=" + amount + ", customer=" + customer + "]";
	}

}
