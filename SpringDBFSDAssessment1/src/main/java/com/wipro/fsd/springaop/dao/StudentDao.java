package com.wipro.fsd.springaop.dao;

import java.util.List;

import javax.sql.DataSource;

import com.wipro.fsd.springaop.model.Student;

public interface StudentDao {
	public void setDataSource(DataSource ds);
	public Student getStudent(Integer id);
	public List<Student> listStudents();
}
