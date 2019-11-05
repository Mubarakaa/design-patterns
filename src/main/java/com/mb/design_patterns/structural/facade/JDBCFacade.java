package com.mb.design_patterns.structural.facade;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCFacade {
	DbSingleton instance = null;
	
	public JDBCFacade() {
		instance = DbSingleton.getInstance();
	}
	
	public int createTable() {
		int count = 0;
		
		try {
			Connection connection = instance.getConnection();
			Statement sta = connection.createStatement();
			count = sta.executeUpdate("create table address(ID INTEGER, StreetName VARCHAR(20), City VARCHAR(20))");
			sta.close();
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
		
	}

}
