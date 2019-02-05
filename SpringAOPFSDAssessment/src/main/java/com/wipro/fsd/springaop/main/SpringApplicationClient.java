package com.wipro.fsd.springaop.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.fsd.springaop.dao.StudentDao;
import com.wipro.fsd.springaop.model.Student;

public class SpringApplicationClient {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Map<String, Student> studentsMap = initializeObjects();
		StudentDao student = (StudentDao) context.getBean("studentDao");
		student.setStudents(studentsMap);
		student.getAllDetails();
		student.getDetails("std10");
		student.getDetails("std50");
		student.getDetails("std100");


	}
	
	public static Map<String, Student> initializeObjects() {

		Map<String, Student> map = new HashMap<String, Student>();

		for (int i = 1; i <= 100; i++) {
			String stId = "std" + i;
			String name = generateNameAddr();
			String addr = generateNameAddr();
			map.put(stId, new Student(stId, name, addr));
		}

		return map;

	}

	public static String generateNameAddr() {
		String ALLCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder str = new StringBuilder();
		Random rnd = new Random();
		while (str.length() < 20) { 
			int index = (int) (rnd.nextFloat() * ALLCHARS.length());
			str.append(ALLCHARS.charAt(index));
		}
		String myStr = str.toString();
		return myStr;

	}
}
