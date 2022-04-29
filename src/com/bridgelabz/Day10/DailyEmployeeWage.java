package com.bridgelabz.Day10;

import java.util.Scanner;

public class DailyEmployeeWage {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		int Is_present = 1;
		int Wage;
		double EmpStatus = Math.floor(Math.random()*10) %2;
		if (EmpStatus == Is_present) {
			System.out.println("Enter How many hour is Worked: ");
		int hours = input.nextInt();
		Wage = hours *20;
			System.out.println("Wage is:"+Wage);
			
	}
		else
			System.out.println("Employee is Absent");
	}
}
