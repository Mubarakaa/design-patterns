package com.mb.design_patterns.structural.bridge;

public class Square extends Shape {

	public Square(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		// TODO Auto-generated method stub
		color.applyColor();
	}

}
