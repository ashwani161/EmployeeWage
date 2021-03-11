package com.employee;

public class EmpWage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;

	public static void main(String[] args) {
		int empHrs = 0;
		int empWage = 0;
		System.out.println("Welcome to Employee");
		System.out.println("Wage Computation");
		System.out.println("Program On Master Branch");
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		if(empCheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
		switch (empCheck) {
		  case IS_PART_TIME:
			empHrs = 8;
			break;
		  case IS_FULL_TIME:
			empHrs = 4;
			break;
		default:
			empHrs = 0;
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " + empWage);
		
	}
}
