package com.thisisujjawal;

public class Address {
	private String street;
	private int houseNumber;
	
	
	public Address() {
		super();
		System.out.println("Address default constructor called..!");
	}
	
	// For constructor injection
	public Address(String street, int houseNumber) {
		super();
		this.street = street;
		this.houseNumber = houseNumber;
	}


	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", houseNumber=" + houseNumber + "]";
	}
	
	
}
