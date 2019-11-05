package com.mb.design_patterns.behavorial.chainofresponsibility;

public class Request {

	private RequestType requestType;
	private Double amount;
	
	public Request(RequestType requestType, Double amount) {
		this.requestType = requestType;
		this.amount = amount;
	}
	
	public RequestType getRequestType() {
		return requestType;
	}
	public Double getAmount() {
		return amount;
	}
	
	
}
