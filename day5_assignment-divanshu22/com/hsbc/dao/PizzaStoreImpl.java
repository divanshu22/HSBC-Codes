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
 * Implementation of Pizza Store using Arrays as the database
 * 
 * 
 */

public class PizzaStoreImpl implements PizzaStore {

	static int pizzaCount = 0;
	Pizza[] pizza = new Pizza[5];

	public void addnewPizza(Pizza e) throws PizzaAlreadyExistsException {
		String pizzaName = e.getPizzaName();
		try {
			if (getPizzaByName(pizzaName) != null)
				throw new PizzaAlreadyExistsException(pizzaName + " PIZZA NAME EXIST");
		}catch(NoPizzaFoundException npfe) {
			pizza[pizzaCount] = e;
			pizzaCount += 1;
		}
	}

	public Pizza getPizzaByName(String pizzaName) throws NoPizzaFoundException {
		for (Pizza p : pizza) {
			if (p != null && p.getPizzaName() == pizzaName) {
				return p;
			}
		}
		throw new NoPizzaFoundException("NO PIZZA WITH NAME " + pizzaName + "FOUND");
		
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
			throw new NoPizzaFoundException("NO PIZZA WITH SIZE " + size + "FOUND");
	}

	public void displayAllPizzas() {
		for (Pizza p : pizza)
			System.out.println(p.toString());
		
	}
}
