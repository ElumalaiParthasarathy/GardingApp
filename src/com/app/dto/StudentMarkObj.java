package com.app.dto;

public class StudentMarkObj {

	private String name;
	private String grade;
	private int tamilMark;
	private int englishMark;
	private int mathsMark;
	private int scienceMark;
	private int socialMark;
	private int total;
	private int maxMark;
	private int cons;
	private int percentage;
	
	
	
	
	
	public StudentMarkObj(String name, int mark1, int mark2, int mark3, int mark4, int mark5) {
		super();
		this.name = name;
		this.tamilMark = mark1;
		this.englishMark = mark2;
		this.mathsMark = mark3;
		this.scienceMark = mark4;
		this.socialMark = mark5;
	}
	
	@Override
	public String toString() {
		return "name= " + name +  "\n mark1=" + tamilMark + "\n mark2=" + englishMark
				+ "\n mark3=" + mathsMark + "\n mark4=" + scienceMark + "\n mark5=" + socialMark + "\n total=" + total + "\n percentage="
				+ percentage +"\n grade=" + grade + "";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark1() {
		return tamilMark;
	}
	public void setMark1(int mark1) {
		this.tamilMark = mark1;
	}
	public int getMark2() {
		return englishMark;
	}
	public void setMark2(int mark2) {
		this.englishMark = mark2;
	}
	public int getMark3() {
		return mathsMark;
	}
	public void setMark3(int mark3) {
		this.mathsMark = mark3;
	}
	public int getMark4() {
		return scienceMark;
	}
	public void setMark4(int mark4) {
		this.scienceMark = mark4;
	}
	public int getMark5() {
		return socialMark;
	}
	public void setMark5(int mark5) {
		this.socialMark = mark5;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getCons() {
		return cons;
	}

	public void setCons(int cons) {
		this.cons = cons;
	}

	public int getMaxMark() {
		return maxMark;
	}

	public void setMaxMark(int maxMark) {
		this.maxMark = maxMark;
	}

	
	
	
	
	
	
	
	
	
	
	
}
