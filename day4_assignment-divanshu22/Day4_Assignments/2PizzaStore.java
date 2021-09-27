package com.hsbc.Day4;

public interface PizzaStore {
	
	String addNewPizza(Pizza e);
	
	Pizza getPizzaByName(String pizzaname);
	
	Pizza getPizzaNameBySize(int size);
	

}
