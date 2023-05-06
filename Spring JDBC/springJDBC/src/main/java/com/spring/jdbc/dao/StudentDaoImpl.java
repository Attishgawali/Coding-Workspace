package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring_core.jdbc.Student;


public class StudentDaoImpl implements StudentDao{
	
	private JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
//	INSERT METHOD
	public int insert(Student student) {
		String query = "insert into student (id,name,city) value(?,?,?)";
		int r=this.template.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}

	
//	UPDATE METHOD (change)
	public int change(Student student) {
		String query= "update student set name = ? , city = ? where id = ?";
		int r = this.template.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}

	
// 	DELETE METHOD 
	public int delete(Student student) {
		String query= "delete from student where id=?";
		int r = this.template.update(query,student.getId());
		return r;
	}

	
//  GET_STUDETN_OBJECT
	public Student getStudent(int studentId) {
		String query= "select * from student where id = ?";
		RowMapper<Student> rowMapper= new RowMapperImpl();
		Student student = this.template.queryForObject(query, rowMapper,studentId);
		return student;
	}

	public List<Student> getAllStudents() {
		String query= "select * from student";
		List<Student> students = this.template.query(query,new RowMapperImpl());
		return students;
	}
	
	

	
	
}
