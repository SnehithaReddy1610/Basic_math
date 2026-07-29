package com.employeedetails;

public class Manager {
	
	private String ManagerName;

	public Manager(String managerName) {
		
		ManagerName = managerName;
	}

	public String getManagerName() {
		return ManagerName;
	}

	public void setManagerName(String managerName) {
		this.ManagerName = managerName;
	}
	public void displayEmployee(Employee employee) {
		System.out.println("Employee ID:"+employee.getEmployeeID());
		System.out.println("Employee Name:"+employee.getEmployeeName());
		System.out.println("Employee Designation:"+employee.getEmployeeDesignation());
		System.out.println("Employee salary"+employee.getSalary());
		double salary = employee.getSalary();
		
		if(salary >= 30000 && salary <= 40000) {
			employee.setSalary(salary+salary*1.15);
		}
		else if(salary > 40000 && salary <= 50000) {
			employee.setSalary(salary+salary*1.10);
		}
		else if(salary > 50000 && salary <= 60000) {
			employee.setSalary(salary+salary*0.05);
		}else {
			System.out.println("No increment");
		}
	}
	
	

}
