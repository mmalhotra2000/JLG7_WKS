package edu.gs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long addId;

	private String addLine1;

	private String addressLine2;

	public Address(String addLine1, String addressLine2) {
		super();
		this.addLine1 = addLine1;
		this.addressLine2 = addressLine2;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [addId=" + addId + ", addLine1=" + addLine1 + ", addressLine2=" + addressLine2 + "]";
	}

}
