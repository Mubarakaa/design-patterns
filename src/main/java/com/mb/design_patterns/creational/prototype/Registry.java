package com.mb.design_patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private Map<String, Item> items = new HashMap<>();
	
	public Registry() {
		loadItems();
	}
	
	public Item createItem(String type) {
		Item item = null;
		try {
			item = (Item) (items.get(type)).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return item;
		
	}
	
	private void loadItems() {
		Movie movie = new Movie();
		movie.setTitle("Basic movie");
		movie.setPrice(24.6);
		movie.setRuntime("2 hours");
		items.put("Movie", movie);
		
		Book book = new Book();
		book.setTitle("Basic book");
		book.setPrice(89);
		book.setNumberOfPages(777);
		items.put("Book", book);
		
	}
}
