package com.hsbc.dao;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.hsbc.dao.util.PizzaStore;
import com.hsbc.exception.NoPizzaFoundException;
import com.hsbc.exception.PizzaAlreadyExistsException;
import com.hsbc.model.Pizza;

/*
 * 
 * 
 * Pizza Store database implemented in the form of HashMap
 * 
 */

public class PizzaMapStoreImpl implements PizzaStore {

	Map<String, Pizza> pizza = new HashMap<>();

	public void addnewPizza(Pizza e) throws PizzaAlreadyExistsException {
		String pizzaName = e.getPizzaName();
		try {
			if (getPizzaByName(pizzaName) != null)
				throw new PizzaAlreadyExistsException(pizzaName + " PIZZA NAME EXISTS!");
		} catch (NoPizzaFoundException npfe) {
			pizza.put(pizzaName, e);
		}
	}

	public Pizza getPizzaByName(String pizzaName) throws NoPizzaFoundException {
		Set<String> pizzaNames = pizza.keySet();
		for (String name : pizzaNames) {
			if (name.equals(pizzaName)) {
				return pizza.get(name);
			}
		}
		throw new NoPizzaFoundException("NO PIZZA WITH NAME  " + pizzaName + "FOUND");

	}

	public List<Pizza> getPizzaNamesBySize(int size) throws NoPizzaFoundException {
		List<Pizza> getPizza = new ArrayList<>();
		Set<String> pizzaNames = pizza.keySet();
		for (String name : pizzaNames) {
			if (size == pizza.get(name).getSizeInCms()) {
				getPizza.add(pizza.get(name));
			}
		}
		if (getPizza.get(0) != null)
			return getPizza;
		else
			throw new NoPizzaFoundException("NO PIZZA WITH SIZE" + size + "FOUND");
	}
	
	public void displayAllPizzas() {
		System.out.println(pizza);
		
	}
}
