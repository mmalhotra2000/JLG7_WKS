package com.assinment.iris;

public class Price {

	private String price;
	private String instrumentId;

	public Price(String price, String instrumentId) {
		super();
		this.price = price;
		this.instrumentId = instrumentId;
	}

	public Price() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getInstrumentId() {
		return instrumentId;
	}

	public void setInstrumentId(String instrumentId) {
		this.instrumentId = instrumentId;
	}

	@Override
	public String toString() {
		return "Price [price=" + price + ", instrumentId=" + instrumentId + "]";
	}

}
