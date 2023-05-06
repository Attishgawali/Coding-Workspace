package com.springcore.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring_core.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	JdbcTemplate template = new JdbcTemplate();
	public JdbcTemplate getTemplate() {
		return template;
	}
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

//	Add Employee
	public int insert(Employee employee) {
		String query ="insert into employee(empId,empName,empAddress,empPhones) values (?,?,?,?)";
		int r = this.template.update(query,employee.getEmpId(),employee.getEmpName(),employee.getEmpAddress(),employee.getEmpPhones());
		return r;
	}
public int delete(Employee employee) {
	String query ="delete employee where empdId= ?";
	return 0;
}
	


}
