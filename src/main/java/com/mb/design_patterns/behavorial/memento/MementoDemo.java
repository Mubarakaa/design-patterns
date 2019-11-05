package com.mb.design_patterns.behavorial.memento;

public class MementoDemo {

	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();
		Employee employee = new Employee();
		
		employee.setName("John");
		employee.setPhone("943989439");
		employee.setAddress("Ajwa");
		
		caretaker.save(employee);
		System.out.println(employee);
		
		employee.setPhone("43434343");
		caretaker.save(employee);
		
		System.out.println(employee);
		
		employee.setPhone("1234556");
		caretaker.revert(employee);
		
		System.out.println(employee);
		
		caretaker.revert(employee);
		
		System.out.println(employee);
		
	}

}
