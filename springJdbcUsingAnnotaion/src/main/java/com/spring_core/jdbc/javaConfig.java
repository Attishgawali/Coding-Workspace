package com.spring_core.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//import com.spring.jdbc.dao.StudentDao;
//import com.spring.jdbc.dao.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages={"com.spring.jdbc.dao"})
public class javaConfig {
	
	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds= new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc" );
		ds.setUsername("root");
		ds.setPassword("root12345");
		return ds;
	}
	
	@Bean("template")
	public JdbcTemplate getTemplate() {
		JdbcTemplate template= new JdbcTemplate();
		template.setDataSource(getDataSource());
		return template;
	}
	
//	@Bean("studentDao")
//	public StudentDao getStudentDao() {
//		StudentDaoImpl studentDao = new StudentDaoImpl();
//		studentDao.setTemplate(getTemplate());
//		return studentDao;
//	}
}
