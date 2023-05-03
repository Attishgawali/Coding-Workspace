package com.spring_core.Autowiring.Stereotype_Annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("Sinnar")
	private String city;
	
	@Value("Shird Highway")
	private String street;
	
	@Value("422103")
	private int pincode;

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

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String street, int pincode) {
		super();
		this.city = city;
		this.street = street;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", pincode=" + pincode + "]";
	}
	
	
}
