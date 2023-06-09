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

//	Init and destroy method (Lifecycle of bean)
	
//	Note: init and destroy methods are always public, void and no argument
	public void init() {
		// You can initilise DB configuration etc.
		System.out.println("Address class : init method called..!");
	}
	
	public void destroy() {
		//You can end your DB configuration etc.
		System.out.println("Address class: destroy method called..!");
	}

}
