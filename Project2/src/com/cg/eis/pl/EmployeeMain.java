package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;
import com.cg.eis.service.IEmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee emp=acceptDetails();
		IEmployeeService service=new EmployeeServiceImpl();
		service.findInsuranceScheme(emp);
		printDetails(emp);
		
		
	}
	
	public static Employee acceptDetails(){
		
		Employee emp=new Employee();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee Id");
		int id=sc.nextInt();
		emp.setEmloyeeId(id);
		
		System.out.println("Enter Name");
		String name=sc.next();
		emp.setName(name);
		
		System.out.println("Enter Salary");
		double sal=sc.nextDouble();
		emp.setSalary(sal);
		
		System.out.println("Enter Designation");
		String design=sc.next();
		emp.setDesignation(design);
		
		return emp;
	}
	
	public static void printDetails(Employee emp)
	{
		
		System.out.println("employee ID :"+emp.getEmloyeeId());
		System.out.println("Employee Name :"+emp.getName());
		System.out.println("Designation :"+emp.getDesignation());
		System.out.println("Salary :"+emp.getSalary());
		System.out.println("Insurance Schema :"+emp.getInsuranceScheme());
		
	}

}
