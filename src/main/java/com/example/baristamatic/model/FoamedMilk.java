package com.example.baristamatic.model;

import com.example.baristamatic.Ingredient;

public class FoamedMilk extends Ingredient {

	public FoamedMilk() {
		super("Foamed Milk", 35);
	}

	@Override
	public Ingredient clone() {
		return new FoamedMilk();
	}

}