package com.hibernate.Annotation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stuId;
	private String name;
	private Certificate certi;
	
	public Student() {
		super();
	}
	
	public Student(int stuId, String name, Certificate certi) {
		super();
		this.stuId = stuId;
		this.name = name;
		this.certi = certi;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Certificate getCerti() {
		return certi;
	}
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", name=" + name + "]";
	}
	
	

}
