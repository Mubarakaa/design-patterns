package com.mb.design_patterns.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

	private static volatile DbSingleton dbSingleton = null;
	private static Connection con = null;
	
	private DbSingleton() {
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			
			
		} catch ( ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(con != null) {
			throw new RuntimeException("Use getConnection() method to create");
		}
		if(dbSingleton != null) {
			throw new RuntimeException("Use getInstance() method to create");
		}
		
	}
	
	public static DbSingleton getInstance() {
		if(dbSingleton == null) {
			
			synchronized (DbSingleton.class) {
				if(dbSingleton == null) {
					dbSingleton = new DbSingleton();
				}
			}
			
		}
		return dbSingleton;
	}
	
	public Connection getConnection() {
		if(dbSingleton == null) {
			
			synchronized (DbSingleton.class) {
				if(con == null) {
					try {
						con=DriverManager.getConnection(  
								"jdbc:mysql://localhost:3306/demo","peaas","peaas");
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}
		return con;
	}
	
}
