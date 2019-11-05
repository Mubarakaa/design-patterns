package com.mb.design_patterns.structural.proxy;

public class TwitterDemo {

	public static void main(String[] args) {
		TwitterService service = (TwitterService) SecuityProxy.newInstance(new TwitterServiceStub());
		System.out.println(service.getTimeline("must"));
	}

}
