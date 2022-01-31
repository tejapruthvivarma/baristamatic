package com.example.baristamatic.model;

import com.example.baristamatic.Ingredient;

public class SteamedMilk extends Ingredient {

	public SteamedMilk() {
		super("Steamed Milk", 35);
	}

	@Override
	public Ingredient clone() {
		return new SteamedMilk();
	}

}