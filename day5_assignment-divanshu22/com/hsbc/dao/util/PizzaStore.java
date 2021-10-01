package com.hsbc.dao.util;

import java.util.List;

import com.hsbc.exception.NoPizzaFoundException;
import com.hsbc.exception.PizzaAlreadyExistsException;
import com.hsbc.model.Pizza;

/*
 * 
 * Interface made of Pizza with DAO classes call implements
 * 
 * 
 */
public interface PizzaStore {
	void addnewPizza(Pizza e) throws PizzaAlreadyExistsException;
	Pizza getPizzaByName(String pizzaName) throws NoPizzaFoundException;
	List<Pizza> getPizzaNamesBySize(int size) throws NoPizzaFoundException;
	void displayAllPizzas();
}
