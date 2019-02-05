package com.wipro.fsd.springaop.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.fsd.springaop.dao.StudentDao;
import com.wipro.fsd.springaop.model.Student;

public class SpringApplicationClient {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");

		StudentDao sjt = (StudentDao) context.getBean("studentDao");
		getAllDetails(sjt);
		getDetails(sjt, 5);
	}

	private static void getDetails(StudentDao sjt, int i) {
		Student student = sjt.getStudent(i);
		System.out.print("Id: " + student.getStudentId());
		System.out.print(", Name: " + student.getStudentName());
		System.out.println(", Address: " + student.getStudentAddress());
		System.out.println("----------------------------------------------------------");

	}

	private static void getAllDetails(StudentDao sjt) {
		List<Student> students = sjt.listStudents();
		for (Student record : students) {
			System.out.print("Id: " + record.getStudentId());
			System.out.print(", Name: " + record.getStudentName());
			System.out.println(", Address: " + record.getStudentAddress());
			System.out.println("----------------------------------------------------------");
		}
	}
}
