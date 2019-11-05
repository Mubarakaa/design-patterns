package com.mb.design_patterns.behavorial.iterator;

import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		BikeRepository bikeRepo = new BikeRepository();
		
		bikeRepo.addBike("Cervelo");
		bikeRepo.addBike("Scott");
		bikeRepo.addBike("Fuji");
		
		Iterator<String> bikeIterator = bikeRepo.iterator();
		while(bikeIterator.hasNext()) {
			System.out.println(bikeIterator.next());
		}
		
		for (String string : bikeRepo) {
			System.out.println(string);
		}
		
	}

}
