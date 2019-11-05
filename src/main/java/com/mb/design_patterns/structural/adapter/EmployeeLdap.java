package com.mb.design_patterns.structural.adapter;

public class EmployeeLdap {
	
	private String id1;
	private String firstName1;
	private String lastName1;
	private String email1;
	
	public EmployeeLdap(String id1, String firstName1, String lastName1, String email1) {
		this.id1 = id1;
		this.firstName1 = firstName1;
		this.lastName1 = lastName1;
		this.email1 = email1;
	}
	
	public String getId1() {
		return id1;
	}
	public String getFirstName1() {
		return firstName1;
	}
	public String getLastName1() {
		return lastName1;
	}
	public String getEmail1() {
		return email1;
	}
	
	
}
