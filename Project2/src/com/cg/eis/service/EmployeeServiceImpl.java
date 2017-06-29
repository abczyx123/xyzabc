package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements IEmployeeService{
	
	public void findInsuranceScheme(Employee emp){
		double sal=emp.getSalary();
		String desn=emp.getDesignation();
		if(sal>5000 && sal<2000 && desn.equals("System Associate"))
			emp.setInsuranceScheme("Schema C");
		else if(sal>=2000 && desn.equals("Programmer"))
			emp.setInsuranceScheme("Scheme B");
		else if(sal>=40000 && desn.equals("Manager"))
			emp.setInsuranceScheme("Scheme A");
		else if(sal>5000)
			emp.setInsuranceScheme("No Scheme");
	}

}
