package com.example.baristamatic.model;

import com.example.baristamatic.Ingredient;

public class Cocoa extends Ingredient {

	public Cocoa() {
		super("Cocoa", 90);
	}

	@Override
	public Ingredient clone() {
		return new Cocoa();
	}

}