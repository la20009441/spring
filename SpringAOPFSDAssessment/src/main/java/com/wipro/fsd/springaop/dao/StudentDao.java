package com.wipro.fsd.springaop.dao;

import java.util.Map;

import com.wipro.fsd.springaop.model.Student;

public class StudentDao {
	public Map<String, Student> students;

	public Map<String, Student> getStudents() {
		return students;
	}

	public void setStudents(Map<String, Student> students) {
		this.students = students;
	}

	public void getAllDetails() {

		for (String key : students.keySet()) {
			System.out.println(students.get(key));
		}

	}

	public void getDetails(String stdId) {
		System.out.println(students.get(stdId));

	}

}
