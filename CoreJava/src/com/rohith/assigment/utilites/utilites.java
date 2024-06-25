package com.rohith.assigment.utilites;
import com.rohith.assigment.employee.Employee;
public class utilites {
	public static void raisesal(Employee employee,int percentage) {
		int newSalary = employee.getSalary() + employee.getSalary() * (percentage/100);
		employee.setSalary(newSalary);
		
	}
	
	
	public static void printemp(Employee employee) {
		System.out.println("Name:"+ employee.getName());
		System.out.println("EmpID:"+ employee.getEmpid());
		System.out.println("Salary:"+ employee.getSalary());

	}
}