package com.employee;

class EmpWage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;;
	
	public EmpWage() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}
	
	private void addComapnyEmpWage(String company, int empRatePerHour, 
			int numOfWorkingDays, int maxHoursPerMonth) {
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour,
				numOfWorkingDays, maxHoursPerMonth);
		numOfCompany++;
	}
	private void computeEmpWage() {
		for(int i=0; i<numOfCompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
		}
	}
		
	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		//Variables
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
        // Computation
		while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth &&
				totalWorkingDays < companyEmpWage.numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHrs);
		}
		return totalEmpHrs * companyEmpWage.empRatePerHour;
	}
	
	public static void main(String[] args) {
		EmpWage empWage = new EmpWage();
		empWage.addComapnyEmpWage("DMart", 20, 2, 10);
		empWage.addComapnyEmpWage("reliance", 10, 4, 20);
		empWage.computeEmpWage();
	}
}
