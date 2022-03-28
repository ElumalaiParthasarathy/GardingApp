package com.app.server;

import com.app.dto.StudentMarkObj;

public interface PercentageCalc {
	
	
	public StudentMarkObj total(StudentMarkObj studentMarkObj);
	public StudentMarkObj percentage(StudentMarkObj studentMarkObj);
	public StudentMarkObj grade(StudentMarkObj studentMarkObj);

}
