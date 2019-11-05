package com.mb.design_patterns.creational.factorymethid;

public class Shop extends Website {

	@Override
	public void createWebsite() {
		pages.add(new ItemPage());
		pages.add(new AboutPage());
		pages.add(new CartPage());

	}

}
