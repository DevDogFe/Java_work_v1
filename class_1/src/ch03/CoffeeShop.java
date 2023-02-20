package ch03;

import java.util.List;

public class CoffeeShop {
	
	private int id;
	private String name;
	private String location;
	private java.util.List<Coffee> orders;
	
	public CoffeeShop(int id, String name, String location, List<Coffee> orders) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.orders = orders;
	}

}
