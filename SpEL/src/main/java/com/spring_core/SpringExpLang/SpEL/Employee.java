package com.spring_core.SpringExpLang.SpEL;

import org.springframework.beans.factory.annotation.Value;



public class Employee {
	
	@Value("#{11+22}")
	private int empId;
	
	@Value("Attish")
	private String empName;
	
	@Value("Sinnar")
	private String empAddress;
	
	@Value("#{ T(java.lang.Math).PI }")
	private double x;
	
	@Value("#{8>5}")
	private boolean isActive;
	
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", x=" + x
				+ ", isActive=" + isActive + "]";
	}
	
	
	
	
}
