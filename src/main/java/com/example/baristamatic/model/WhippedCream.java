package com.example.baristamatic.model;

import com.example.baristamatic.Ingredient;

public class WhippedCream extends Ingredient {

	public WhippedCream() {
		super("Whipped Cream", 100);
	}

	@Override
	public Ingredient clone() {
		return new WhippedCream();
	}

}