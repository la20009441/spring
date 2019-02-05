package com.wipro.fsd.springaop.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.wipro.fsd.springaop.model.Student;

public interface StudentDao {
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate);

	public Student getStudent(int id);

	public List<Student> listStudents();
}
