package com.wipro.fsd.springaop.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.wipro.fsd.springaop.model.Student;

public class StudentMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student=new Student();
		student.setStudentId(rs.getString("id"));
		student.setStudentName(rs.getString("name"));
		student.setStudentAddress(rs.getString("address"));
		return student;
	}

}