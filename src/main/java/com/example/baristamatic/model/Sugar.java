package com.example.baristamatic.model;

import com.example.baristamatic.Ingredient;

public class Sugar extends Ingredient {

	public Sugar() {
		super("Sugar", 25);
	}

	@Override
	public Ingredient clone() {
		return new Sugar();
	}

}