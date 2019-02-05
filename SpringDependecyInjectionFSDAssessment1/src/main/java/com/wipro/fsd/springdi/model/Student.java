package com.wipro.fsd.springdi.model;

import java.io.Serializable;
import java.util.List;

public class Student implements Serializable {

	private static final long serialVersionUID = -1902389058290492357L;

	private String studentId;
	private String studentName;
	private List<Test> studentTest;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<Test> getStudentTest() {
		return studentTest;
	}

	public void setStudentTest(List<Test> studentTest) {
		this.studentTest = studentTest;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentTest=" + studentTest
				+ "]";
	}

}
