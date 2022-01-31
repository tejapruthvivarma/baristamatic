package com.example.baristamatic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.baristamatic.Inventory;
import com.example.baristamatic.Menu;
import com.example.baristamatic.dto.inventoryDTO;
import com.example.baristamatic.dto.menuDTO;

@RestController
public class BaristaController {
	
	@Autowired
	Menu menu;
	
	@Autowired
	Inventory inventory;
	
	@SuppressWarnings("unchecked")
	@GetMapping(path="/menu",
			produces = MediaType.APPLICATION_JSON_VALUE)
	
	public ResponseEntity<List<menuDTO>> getMenu() throws Exception{
		
		try {
		return ResponseEntity.ok().body(menu.display());
		}
		
		catch(Exception e) {
			return (ResponseEntity<List<menuDTO>>) ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR) ;
		}
	}
	
	
	@SuppressWarnings("unchecked")
	@GetMapping(path="/inventory",
			produces = MediaType.APPLICATION_JSON_VALUE)
	
	public ResponseEntity<List<inventoryDTO>> getInventory() throws Exception{
		
		try {
		return ResponseEntity.ok().body(inventory.display());
		}
		
		catch(Exception e) {
			return (ResponseEntity<List<inventoryDTO>>) ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping(path="/restock",
			produces = MediaType.TEXT_PLAIN_VALUE)
	
	public ResponseEntity<String> restock() throws Exception{
		try {
			inventory.restock();
			return ResponseEntity.ok().body("Restock sucessful");
		}
		
		catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal server error: " + e.getMessage());
		}
		
	}
	
	
	@GetMapping(path="/beverage/{beverage}",
			produces = MediaType.TEXT_PLAIN_VALUE)
	
	public ResponseEntity<String> dispenseBewerage(@PathVariable int beverage) throws Exception{
		try {
			
			return ResponseEntity.ok().body(menu.makeDrink(beverage));
		}
		
		catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal server error: " + e.getMessage());
		}
	}

}
