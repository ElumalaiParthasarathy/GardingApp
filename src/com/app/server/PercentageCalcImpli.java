package com.app.server;

import com.app.dto.StudentMarkObj;

public class PercentageCalcImpli implements PercentageCalc {
	
	
	

	@Override
	public StudentMarkObj total(StudentMarkObj studentMarkObj) {
	studentMarkObj.setTotal(studentMarkObj.getMark1()+studentMarkObj.getMark2()+studentMarkObj.getMark3()+studentMarkObj.getMark4()+studentMarkObj.getMark5());
		
	return studentMarkObj;
	}

	@Override
	public StudentMarkObj percentage(StudentMarkObj studentMarkObj) {
		studentMarkObj.setCons(100);
		studentMarkObj.setMaxMark(500);
		studentMarkObj.setPercentage ((studentMarkObj.getTotal()*studentMarkObj.getCons())/studentMarkObj.getMaxMark());
		return studentMarkObj;
	}

	@Override
	public StudentMarkObj grade(StudentMarkObj studentMarkObj) {
		
		
		if (studentMarkObj.getPercentage() >= 95) {
			studentMarkObj.setGrade("Secured A+");
		}
		else if (studentMarkObj.getPercentage() >= 85) {
			studentMarkObj.setGrade("Secured A");
		}
		else if (studentMarkObj.getPercentage() >= 75) {
			studentMarkObj.setGrade("Secured B+");
			
		}
		else if (studentMarkObj.getPercentage() >= 65 ) {
			studentMarkObj.setGrade("Secured B");
		}
		else if (studentMarkObj.getPercentage() >= 55) {
			studentMarkObj.setGrade("Secured C+");
		}
		else if (studentMarkObj.getPercentage() >= 45 ) {
			studentMarkObj.setGrade("Secured c");
		}
		else if (studentMarkObj.getPercentage() < 45) {
			studentMarkObj.setGrade("No Rank");
		}
		else {
			studentMarkObj.setGrade("Student is Absent");
		}
		
		
		return studentMarkObj;
	}

}
