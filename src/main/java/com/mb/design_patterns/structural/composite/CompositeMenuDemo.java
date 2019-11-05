package com.mb.design_patterns.structural.composite;

public class CompositeMenuDemo {

	public static void main(String[] args) {
		
		Menu mainMenu = new Menu("Main", "/main");
		MenuItem safetyMenuItem = new MenuItem("safety", "/safety");
		mainMenu.add(safetyMenuItem);
		
		Menu claimsMenu = new Menu("Claims", "/claims");
		mainMenu.add(claimsMenu);
		
		MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");
		claimsMenu.add(personalClaimsMenu);
		
		System.out.println(mainMenu.toString());
		
	}
}
