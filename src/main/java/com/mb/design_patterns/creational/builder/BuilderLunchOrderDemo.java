package com.mb.design_patterns.creational.builder;

public class BuilderLunchOrderDemo {

	public static void main(String[] args) {
		LunchOrder.Builder builder = new LunchOrder.Builder();
		builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");
		
		LunchOrder lunchOrder = builder.build();
		
		System.out.println(lunchOrder.toString());
	}

}
