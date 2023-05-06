package com.spring_core.entity;

public class Employee {
	
	private int empId;
	private String empName;
	private String empAddress;
	private int empPhones;
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
	public int getEmpPhones() {
		return empPhones;
	}
	public void setEmpPhones(int empPhones) {
		this.empPhones = empPhones;
	}
	public Employee(int empId, String empName, String empAddress, int empPhones) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empPhones = empPhones;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", empPhones="
				+ empPhones + "]";
	}
	
	

}
