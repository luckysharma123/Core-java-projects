package com.dxc.service;

import com.dxc.model.Result;
import com.dxc.model.Student;

public class ResultCalculationService {
	
	public Result calculateResult(Student student) {
		
		Result result=new Result();
		if((student.getMark1()+student.getMark2()+student.getMark3())>200)
		{
			result.setRollNo(student.getRollNo());
			result.setGrade("PASS");
		}
		else {
			result.setRollNo(student.getRollNo());
		    result.setGrade("FAIL");
	    }
		return result;
			
		} 
	    public String calculateResult(int rollno,String name,int mark1,int mark2,int mark3) {
		String grade=null;
		if((mark1+mark2+mark3)>200)
        grade="PASS";
        else
	    grade="FAIL";
       return grade;

	
	}
}
	


