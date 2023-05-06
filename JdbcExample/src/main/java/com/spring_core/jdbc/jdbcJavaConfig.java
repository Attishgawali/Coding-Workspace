package com.spring_core.jdbc;

import java.sql.DriverManager;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springcore.dao.EmployeeDao;
import com.springcore.dao.EmployeeDaoImpl;

@Configuration
@ComponentScan(basePackages= {"com.springcore.dao"})
public class jdbcJavaConfig {
	
	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/sb012" );
		ds.setUsername("root");
		ds.setPassword("root12345");
		return ds;
	}
	
	@Bean("template")
	public JdbcTemplate getTemplate() {
		JdbcTemplate template = new JdbcTemplate(getDataSource());
		return template;
	}
	
	@Bean("employeeDao")
	public EmployeeDao getEmployeeDao() {
		EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
		employeeDao.setTemplate(getTemplate());
		return employeeDao;
	}
	
}
