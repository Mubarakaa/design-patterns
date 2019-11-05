package com.mb.design_patterns.structural.bridge;

public class Shape2BridgeDemo {
	public static void main(String[] args) {
		Color blue = new BlueColor();
		Shape square = new Square(blue);
		
		Color red = new RedColor();
		Shape circle = new Circle(red);
		
		square.applyColor();
		circle.applyColor();
	}
}
