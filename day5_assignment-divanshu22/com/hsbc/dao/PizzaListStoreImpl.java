package com.hsbc.dao;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.dao.util.PizzaStore;
import com.hsbc.exception.NoPizzaFoundException;
import com.hsbc.exception.PizzaAlreadyExistsException;
import com.hsbc.model.Pizza;

/*
 * 
 * 
 * Implementation of Pizza Store using Array List type
 * 
 * 
 */
public class PizzaListStoreImpl implements PizzaStore {

	List<Pizza> pizza = new ArrayList<>();

	public void addnewPizza(Pizza e) throws PizzaAlreadyExistsException {
		String pizzaName = e.getPizzaName();
		try {
			if (getPizzaByName(pizzaName) != null)
				throw new PizzaAlreadyExistsException(pizzaName + " Pizza Name Already Exists!!");
		} catch (NoPizzaFoundException npfe) {
			pizza.add(e);
		}
	}

	public Pizza getPizzaByName(String pizzaName) throws NoPizzaFoundException {
		for (Pizza p : pizza) {
			if (p != null && p.getPizzaName() == pizzaName) {
				return p;
			}
		}
		throw new NoPizzaFoundException("No pizza with " + pizzaName + " name found.");
	}

	public List<Pizza> getPizzaNamesBySize(int size) throws NoPizzaFoundException {
		List<Pizza> getPizza = new ArrayList<>();
		for (Pizza p : pizza) {
			if (p != null && p.getSizeInCms() == size) {
				getPizza.add(p);
			}
		}
		if (getPizza.get(0) != null)
			return getPizza;
		else
			throw new NoPizzaFoundException("No pizza with " + size + "cm size found.");
	}

	public void displayAllPizzas() {
		System.out.println(pizza);
		
	}
}
