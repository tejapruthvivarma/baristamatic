package com.example.baristamatic.model;


import com.example.baristamatic.Ingredient;

public class Coffee extends Ingredient {

	public Coffee() {
		super("Coffee", 75);
	}

	@Override
	public Ingredient clone() {
		return new Coffee();
	}

}