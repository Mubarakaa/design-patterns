package com.mb.design_patterns.behavorial.chainofresponsibility;

public class CEO extends Handler {

	@Override
	public void handleRequest(Request request) {
		System.out.println("CEO can approve anything");
	}

}
