package com.thisisujjawal;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
	private String name;
	private int age;
	private List<String> phoneNumber;
	private Set<String> movies;
	private Map<String,String> identity;
	private Properties prop;
	private Address address;
	
	
	public Person() {
		super();
		System.out.println("Person default constructor called..!");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public List<String> getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public Set<String> getMovies() {
		return movies;
	}


	public void setMovies(Set<String> movies) {
		this.movies = movies;
	}


	public Map<String, String> getIdentity() {
		return identity;
	}


	public void setIdentity(Map<String, String> identity) {
		this.identity = identity;
	}


	public Properties getProp() {
		return prop;
	}


	public void setProp(Properties prop) {
		this.prop = prop;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + ", movies=" + movies
				+ ", identity=" + identity + ", prop=" + prop + ", address=" + address + "]";
	}
	
	
}
