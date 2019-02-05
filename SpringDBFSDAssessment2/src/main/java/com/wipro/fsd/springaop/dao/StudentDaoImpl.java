package com.wipro.fsd.springaop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.wipro.fsd.springaop.model.Student;

public class StudentDaoImpl implements StudentDao {

	HibernateTemplate hibernateTemplate;

	@Override
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public Student getStudent(int id) {
		Student student = (Student) hibernateTemplate.get(Student.class, id);
		return student;
	}

	@Override
	public List<Student> listStudents() {
		List<Student> students = new ArrayList<Student>();
		students = hibernateTemplate.loadAll(Student.class);
		return students;
	}

}
