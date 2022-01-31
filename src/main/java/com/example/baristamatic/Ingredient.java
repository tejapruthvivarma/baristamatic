package com.example.baristamatic;


public abstract class Ingredient extends Drink {

	
	private Drink drink;
	private int price;

	public Ingredient(String name, int price) {
		super(name);
		this.price = price;
	}

	
	public String getDescription() {
		return drink.getDescription();
	}

	
	public String getName() {
		return super.getDescription();
	}

	
	public Drink addTo(Drink drink) {
		this.drink = drink;
		return this;
	}

	/**
	 * If the ingredient is part of a drink returns the price of the whole drink.
	 *
	 * If it is not assigned to any drink, it will return the price of the ingredient.
	 */
	@Override
	public int cost() {
		if (drink != null) {
			return price + drink.cost();
		} else {
			return price;
		}
	}

	/**
	 * Returns a copy of the ingredient
 	 */
	public abstract Ingredient clone();

}














