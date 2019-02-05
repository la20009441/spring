package com.wipro.fsd.springdi.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.wipro.fsd.springdi.model.Student;
import com.wipro.fsd.springdi.model.Test;


@Configuration
@Import(TestConfig.class)
public class StudentConfig {

	@Bean
	public Student student(Test test) {
		Student student = new Student();
		student.setStudentId("S001");
		student.setStudentName("Steve");
		student.setStudentTest(Arrays.asList(test));
		return student;
	}
	
	@Bean
	public Student secondStudent(Test firstTest, Test secondTest) {
		Student student = new Student();
		student.setStudentId("S002");
		student.setStudentName("Laxman");
		student.setStudentTest(Arrays.asList(firstTest,secondTest));
		return student;
	}

}
