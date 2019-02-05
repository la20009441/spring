package com.wipro.fsd.springdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.wipro.fsd.springdi.model.Test;

@Configuration
public class TestConfig {

	@Bean
	public Test test() {
		Test test = new Test();
		test.setTestId("T001");
		test.setTestTitle("Core Java Test");
		test.setTestMarks(80);
		return test;
	}

	@Bean
	public Test firstTest() {
		Test test = new Test();
		test.setTestId("T001");
		test.setTestTitle("Core Java Test");
		test.setTestMarks(80);
		return test;
	}

	@Bean
	public Test secondTest() {
		Test test = new Test();
		test.setTestId("T002");
		test.setTestTitle("Spring Test");
		test.setTestMarks(85);
		return test;
	}
}
