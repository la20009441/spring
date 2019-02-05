package com.wipro.fsd.springdi.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.fsd.springdi.config.StudentConfig;
import com.wipro.fsd.springdi.model.Student;

public class SpringApplicationClient {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		Student Student1 = (Student) context.getBean("student");
		Student Student2 = (Student) context.getBean("secondStudent");
		System.out.println("first student data: "+Student1);
		System.out.println("second student data: "+Student2);

	}
}
