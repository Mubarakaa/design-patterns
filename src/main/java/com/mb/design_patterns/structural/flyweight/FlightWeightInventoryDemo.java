package com.mb.design_patterns.structural.flyweight;

public class FlightWeightInventoryDemo {

	public static void main(String[] args) {
		InventorySystem system = new InventorySystem();
		system.takeOrder("Item1", 1);
		system.takeOrder("Item2", 2);
		system.takeOrder("Item3", 3);
		system.takeOrder("Item4", 4);
		system.takeOrder("Item5", 5);
		system.takeOrder("Item3", 6);
		system.takeOrder("Item4", 7);
		system.takeOrder("Item5", 8);
		
		system.process();
		
		System.out.println(system.report());
	}

}
