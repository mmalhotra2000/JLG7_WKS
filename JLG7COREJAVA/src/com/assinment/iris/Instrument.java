package com.assinment.iris;

public class Instrument {

	private String instrumentId;

	private String book;

	public Instrument(String instrumentId, String book) {
		super();
		this.instrumentId = instrumentId;
		this.book = book;
	}

	public String getInstrumentId() {
		return instrumentId;
	}

	public void setInstrumentId(String instrumentId) {
		this.instrumentId = instrumentId;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Instrument [instrumentId=" + instrumentId + ", book=" + book + "]";
	}

}
