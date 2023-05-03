package com.spring_core.constructor_injection_spring;

import java.util.List;

public class Person {
	
	private String name;
	private int personId;
	private Address address;
	private List<String> phones;
	
	public Person(String name, int personId, Address address, List<String> phones) {
		super();
		this.name = name;
		this.personId = personId;
		this.address = address;
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", address=" + address + ", phones=" + phones + "]";
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	

	
	

}
