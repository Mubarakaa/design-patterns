package com.mb.design_patterns.structural.facade;

public class FacadeJDBCDemo {

	public static void main(String[] args) {
		
		JDBCFacade facade = new JDBCFacade();
		facade.createTable();
		
	}
}
