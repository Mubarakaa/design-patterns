package com.mb.design_patterns.structural.facade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbSingleton {
	
	private static DbSingleton instance = null;
	private static Connection con = null;
	
	private DbSingleton() {
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/demo","peaas","peaas");
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}
	
	public static DbSingleton getInstance() {
		
		if(instance == null) {
			instance = new DbSingleton();
		}
		return instance;
	}
	
	public Connection getConnection() {
		return con;
	}

}
