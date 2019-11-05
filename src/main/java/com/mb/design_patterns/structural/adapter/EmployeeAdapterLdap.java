package com.mb.design_patterns.structural.adapter;

public class EmployeeAdapterLdap implements Employee {
	
	private EmployeeLdap employeeLdap;
	
	public EmployeeAdapterLdap(EmployeeLdap employeeLdap) {
		this.employeeLdap = employeeLdap;
	}

	@Override
	public String getId() {
		return employeeLdap.getEmail1();
	}

	@Override
	public String getFirstName() {
		return employeeLdap.getFirstName1();
	}

	@Override
	public String getLastName() {
		return employeeLdap.getLastName1();
	}

	@Override
	public String getEmail() {
		return employeeLdap.getEmail1();
	}

	
	

}
