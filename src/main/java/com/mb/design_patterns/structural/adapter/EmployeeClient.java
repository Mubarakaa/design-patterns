package com.mb.design_patterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
	
	public List<Employee> getEmployeeList() {
		 
		List<Employee> employees = new ArrayList<>();
		Employee employeeFromDb = new EmployeeDB("1", "Neha", "Shah", "neha@gmail.com");
		employees.add(employeeFromDb);
		
		
		
		EmployeeLdap employee = new EmployeeLdap("2", "Manish", "Shah", "manisha@gmail.com");
		employees.add(new EmployeeAdapterLdap(employee));
		
		System.out.println(employees.toString());
		
		return employees;
		
	}
	
	public static void main(String[] args) {
		EmployeeClient client = new EmployeeClient();
		client.getEmployeeList();
	}
}
