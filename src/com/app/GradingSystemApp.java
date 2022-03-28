package com.app;
import java.util.Scanner;

import com.app.dto.StudentMarkObj;
import com.app.server.PercentageCalcImpli;


public class GradingSystemApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the student Name : ");    //getting the student name
		String name = sc.nextLine();                       
		
		System.out.println("enter "+name+"'s Tamil Mark = ");
		int mark1 = sc.nextInt();
		
		System.out.println("enter "+name+"'s English Mark = ");
		int mark2 = sc.nextInt();
		System.out.println("enter "+name+"'s Maths Mark = ");
		int mark3 = sc.nextInt();
		
		System.out.println("enter "+name+"'s Science Mark = ");
		int mark4 = sc.nextInt();
		
		System.out.println("enter "+name+"'s Social Mark = ");
		int mark5 = sc.nextInt();
		
		sc.close();
		
		StudentMarkObj studentmarkObj = new StudentMarkObj(name, mark1, mark2, mark3, mark4, mark5);
		PercentageCalcImpli percentageCalc = new PercentageCalcImpli();
		
		percentageCalc.total(studentmarkObj);
		percentageCalc.percentage(studentmarkObj);
		percentageCalc.grade(studentmarkObj);
		
		System.out.println( studentmarkObj.toString());

	}

}
