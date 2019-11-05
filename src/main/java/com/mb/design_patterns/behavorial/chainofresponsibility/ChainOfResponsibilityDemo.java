package com.mb.design_patterns.behavorial.chainofresponsibility;

public class ChainOfResponsibilityDemo {

	public static void main(String[] args) {
		Director director = new Director();
		VP vp = new VP();
		CEO ceo = new CEO();
		
		director.setSuccessor(vp);
		vp.setSuccessor(ceo);
		
		Request request = new Request(RequestType.CONFERENCE, 500.0);
		director.handleRequest(request);
		
		request = new Request(RequestType.PURCHASE, 1000.0);
		director.handleRequest(request);
		
		request = new Request(RequestType.PURCHASE, 2000.0);
		director.handleRequest(request);
		
	}

}
