package com.spring_core.PureAnnotation;

import org.springframework.stereotype.Component;


public class Student {
	
	private Samosa samosa;
	
	
	@Override
	public String toString() {
		return "Student [samosa=" + samosa + "]";
	}


	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}


	public Samosa getSamosa() {
		return samosa;
	}


	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}


	public void Study() {
		this.samosa.display();
		System.out.println("Student is reading a book");
	}
}
