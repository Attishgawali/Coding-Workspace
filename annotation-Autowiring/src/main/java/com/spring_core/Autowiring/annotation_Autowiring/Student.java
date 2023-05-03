package com.spring_core.Autowiring.annotation_Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	private int stuId;
	private String stuName;
	@Autowired
	@Qualifier("temp2")
	private Address stuAddress;

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Address getStuAddress() {
		return stuAddress;
	}

	public void setStuAddress(Address stuAddress) {
		System.out.println("Setting thorough setter");
		this.stuAddress = stuAddress;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(Address stuAddress) {
		super();
		System.out.println("Setting thorugh construtor");
		this.stuAddress = stuAddress;
	}

	public Student(int stuId, String stuName, Address stuAddress) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuAddress = stuAddress;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuAddress=" + stuAddress + "]";
	}

}
