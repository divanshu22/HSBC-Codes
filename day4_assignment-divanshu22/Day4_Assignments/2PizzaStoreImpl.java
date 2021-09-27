package com.hsbc.Day4;

public class PizzaStoreImpl implements PizzaStore {

	private static Pizza[] pizzaDB = new Pizza[25];
	private static int indexCounter = 0;

	@Override
	public String addNewPizza(Pizza e) {
		pizzaDB[indexCounter++] = e;
		return e.getPizzaName();
	}

	@Override
	public Pizza getPizzaByName(String s) {
		Pizza[] available = findAll();
		Pizza pizz = null;
		for (Pizza p : available) {
			if (p.getPizzaName() == s) {
				pizz = p;
				break;
			}
		}
		return pizz;
	}

	public Pizza[] findAll() {
		Pizza[] availablepizza = new Pizza[indexCounter];
		for (int i = 0; i < indexCounter; i++) {
			availablepizza[i] = pizzaDB[i];
		}
		return availablepizza;
	}

	@Override
	public Pizza getPizzaNameBySize(int size) {
		// TODO Auto-generated method stub
		return null;
	}


}
