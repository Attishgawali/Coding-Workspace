package com.spring_core.PureAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= "com.spring_core.PureAnnotation" )
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa() {
		Samosa samosa = new Samosa();
		return samosa;
	}
	
	@Bean
	public Student getStudent() {
		Student student = new Student(getSamosa());
		return student;
	}

}
