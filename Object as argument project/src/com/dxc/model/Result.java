package com.dxc.model;

public class Result {

	private int rollNo;
	private String grade;
	public Result() {
		super();
		
	}
	public Result(int rollNo, String grade) {
		super();
		this.rollNo = rollNo;
		this.grade = grade;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	
	
	

}
