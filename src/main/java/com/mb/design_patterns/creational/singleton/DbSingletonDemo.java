package com.mb.design_patterns.creational.singleton;

import java.sql.Connection;

public class DbSingletonDemo {

	public static void main(String[] args) {
		DbSingleton dbSingleton = DbSingleton.getInstance();
		Connection connection = dbSingleton.getConnection();
		System.out.println(dbSingleton);
	}

}
