package com.example.baristamatic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.springframework.stereotype.Component;

import com.example.baristamatic.dto.menuDTO;

// Class to store the different available recipes
@Component
public class Menu {
	
	private Map<String, Recipe> recipes;

	public Menu(Inventory inventory) {
		recipes = new TreeMap<String, Recipe>();
		addRecipe(new DecafCoffeeRecipe(inventory));
		addRecipe(new CaffeAmericanoRecipe(inventory));
		addRecipe(new CaffeLatteRecipe(inventory));
		addRecipe(new CaffeMochaRecipe(inventory));
		addRecipe(new CappuccinoRecipe(inventory));
		addRecipe(new CoffeeRecipe(inventory));
	}
	
	// Add a new recipe to the menu
	public void addRecipe(Recipe recipe) {
		if (recipes.containsKey(recipe.name)) {
			throw new RuntimeException();
		}
		else {
			recipes.put(recipe.name, recipe);
		}
	}
	
	public ArrayList<menuDTO> display() {
		ArrayList<menuDTO> menu = new ArrayList<menuDTO>();
		int i = 0;
		for (Entry<String, Recipe> recipe : recipes.entrySet()) {
			menu.add(new menuDTO((i + 1 ),recipe.getKey(), 
					              recipe.getValue().getCost(), recipe.getValue().isInStock()) );
						
			i++;
		}
		
		return menu;
		
	}
	
	// Returns a new drink
	public String makeDrink(int index) {
		if (index < recipes.size()) {
			Iterator<Recipe> it = recipes.values().iterator();
			for (int i = 0; i < index; i++) {
				it.next();
			}
			return it.next().makeDrink();
		}
		else {
			return "Please re-select appropriate beverage";
		}
	}

}
