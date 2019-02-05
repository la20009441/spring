package com.wipro.fsd.springdi.model;

import java.io.Serializable;

public class Test implements Serializable {

	private static final long serialVersionUID = -5339448757005545688L;

	private String testId;
	private String testTitle;
	private int testMarks;

	public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

	public String getTestTitle() {
		return testTitle;
	}

	public void setTestTitle(String testTitle) {
		this.testTitle = testTitle;
	}

	public int getTestMarks() {
		return testMarks;
	}

	public void setTestMarks(int testMarks) {
		this.testMarks = testMarks;
	}

	@Override
	public String toString() {
		return "Test [testId=" + testId + ", testTitle=" + testTitle + ", testMarks=" + testMarks + "]";
	}

}
