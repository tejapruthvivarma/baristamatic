package com.example.baristamatic.model;


import com.example.baristamatic.Ingredient;

public class Cream extends Ingredient {

	public Cream() {
		super("Cream", 25);
	}

	@Override
	public Ingredient clone() {
		return new Cream();
	}

}