package com.example.baristamatic;



// The core class for any drink. It has a name, and a cost 0,
// since it does not have any ingredient so far
public class Drink {

	private String name;

	public Drink(String name) {
		this.name = name;
	}

	public String getDescription() {
		return name;
	}

	public int cost() {
		return 0;
	}

}
