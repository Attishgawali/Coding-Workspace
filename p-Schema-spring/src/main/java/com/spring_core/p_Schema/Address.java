package com.spring_core.p_Schema;

public class Address {
	
	private int addId;
	private String city;
	private String street;
	
	public Address() {
		super();

	}
	
	
	public Address(int addId, String city, String street) {
		super();
		this.addId = addId;
		this.city = city;
		this.street = street;
	}
	public int getAddId() {
		return addId;
	}
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}


	@Override
	public String toString() {
		return "Address [addId=" + addId + ", city=" + city + ", street=" + street + "]";
	}
	
	

}
