package com.hsbc.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.hsbc.dao.util.PizzaStore;
import com.hsbc.exception.NoPizzaFoundException;
import com.hsbc.exception.PizzaAlreadyExistsException;
import com.hsbc.model.Pizza;
/*
 * 
 * 
 * Pizza Store with Tree set as database
 * 
 * 
 */
public class PizzaSortedStoreImpl implements PizzaStore{

	Set<Pizza> pizza = new TreeSet<>();

	public void addnewPizza(Pizza e) throws PizzaAlreadyExistsException {
		String pizzaName = e.getPizzaName();
		try {
			if (getPizzaByName(pizzaName) != null)
				throw new PizzaAlreadyExistsException(pizzaName + " PIZZA NAME EXISTS");
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
		throw new NoPizzaFoundException("NO PIZZA WITH NAME" + pizzaName + "FOUND");

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
			throw new NoPizzaFoundException("NO PIZZA WITH SIZE" + size + "FOUND");
	}
	
	public void displayAllPizzas() {
		System.out.println(pizza);
	}

}
