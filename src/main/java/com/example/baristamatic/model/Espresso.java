package com.example.baristamatic.model;

import com.example.baristamatic.Ingredient;

public class Espresso extends Ingredient {

	public Espresso() {
		super("Espresso", 110);
	}

	@Override
	public Ingredient clone() {
		return new Espresso();
	}

}