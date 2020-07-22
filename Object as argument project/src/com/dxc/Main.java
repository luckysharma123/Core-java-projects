package com.dxc;

import com.dxc.model.Student;
import com.dxc.service.ResultCalculationService;
import com.dxc.model.Result;

public class Main {

	public static void main(String[] args) {
		
		Student student1=new Student();
		
		student1.setRollNo(101);
		student1.setName("Rahul");
		student1.setMark1(80);
		student1.setMark2(80);
		student1.setMark3(80);
		
		
		ResultCalculationService service=new ResultCalculationService();
		
		Result result=service.calculateResult(student1);
		System.out.println("RollNo "+result.getRollNo());
		System.out.println("Result "+result.getGrade());		

	}

}
