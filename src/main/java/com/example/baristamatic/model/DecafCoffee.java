package com.example.baristamatic.model;

import com.example.baristamatic.Ingredient;

public class DecafCoffee extends Ingredient {

	public DecafCoffee() {
		super("Decaf Coffee", 75);
	}

	@Override
	public Ingredient clone() {
		return new DecafCoffee();
	}

}