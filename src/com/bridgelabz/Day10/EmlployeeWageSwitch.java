package com.bridgelabz.Day10;

public class EmlployeeWageSwitch {
	
	public static final int isFullTime = 1;
	public static final int ishalfTime = 1;

	public static void main(String[] args) {
		
		int hours = 0;
        int wage;
        int EmpStatus = (int) Math.floor(Math.random() * 10) % 3;
        switch (EmpStatus) {
         case 1: isFullTime:
            	hours = 8;
                break;
            case 2: ishalfTime:
                hours = 4;
                break;
            default:
                hours = 0;
        }
        wage = hours * 20;
        System.out.println("your daily wage is: "+wage);


	}

}



