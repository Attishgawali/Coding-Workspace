package com.spring_core.constructor_injection_spring;

public class Address {
	
	private String city;
	private int streetNo;
	

	public Address(String city, int streetNo) {
		super();
		this.city = city;
		this.streetNo = streetNo;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", streetNo=" + streetNo + "]";
	}
	
	

}
