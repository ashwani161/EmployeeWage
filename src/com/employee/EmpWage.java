package com.employee;

public class EmpWage {
	public static void main(String[] args) {
		int IS_PART_TIME = 1;
		int IS_FULL_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		int empHrs = 0;
		int empWage = 0;
		System.out.println("Welcome to Employee");
		System.out.println("Wage Computation");
		System.out.println("Program On Master Branch");
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
		if (empCheck == IS_PART_TIME)
			empHrs = 8;
		else if (empCheck == IS_FULL_TIME)
			empHrs = 4;
		else
			empHrs = 0;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " + empWage);
		
	}
}
