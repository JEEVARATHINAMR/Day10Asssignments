package com.bridgelabz.Day10;

public class EmployeePresentAbsent {
	
	public static void main(String[] args) {
		
		int Is_present = 1;
		Double EmpStatus = Math.floor(Math.random() *10 ) %2;
			if(EmpStatus == Is_present)
				System.out.println("The Employee is Present");
			else
				System.out.println("The Employee is Absent");
	}

}
