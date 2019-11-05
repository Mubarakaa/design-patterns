package com.mb.design_patterns.behavorial.mediator;

public class Light {
	
	private boolean isOn = false;
	private String location = "";
	
	public Light(String location) {
		this.location = location;
	}
	
	public Light() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean isOn() {
		return isOn;
	}
	
	public void toggle() {
		if(isOn) {
			off();
			isOn = false;
		}
		else {
			on();
			isOn = true;
		}
	}
	
	public void on() {
		System.out.println("Light switched on");
	}
	
	public void off() {
		System.out.println("Light switched off");
	}
}
