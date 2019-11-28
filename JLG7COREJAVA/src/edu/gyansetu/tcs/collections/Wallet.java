package edu.gyansetu.tcs.collections;

public class Wallet /* implements Comparable<Wallet> */ {

	private int walletId;
	private long price;
	private String brand;


	public Wallet(int walletId, long price, String brand) {
		super();
		this.walletId = walletId;
		this.price = price;
		this.brand = brand;
	}

	public Wallet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getWalletId() {
		return walletId;
	}

	public void setWalletId(int walletId) {
		this.walletId = walletId;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Wallet [walletId=" + walletId + ", price=" + price + ", brand=" + brand + "]";
	}

	// @Override
	// public int compareTo(Wallet o) {
	//
	// return (int) (this.price - o.price);
	//
	// }

}