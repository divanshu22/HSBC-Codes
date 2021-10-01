package com.hsbc.service;

import java.util.List;
import java.util.Scanner;

import com.hsbc.dao.util.PizzaStore;
import com.hsbc.exception.NoPizzaFoundException;
import com.hsbc.exception.PizzaAlreadyExistsException;
import com.hsbc.factory.PizzaStoreFactory;
import com.hsbc.model.Pizza;
/*
 * 
 * ENTER THE SIZE AS THE FIRST INPUT TO RETURN THE PIZZA OF GIVEN SIZE
 * 
 * 
 */
public class CustomerView {
	Scanner scan = new Scanner(System.in);
	PizzaStore pizzaStore = null;
	String pizzaName = "MEXICAN GREEN WAVE";
	int pizzaSizeInCms  = scan.nextInt();
	int code = 0;

	public CustomerView() {
		System.out.println("1. ARRAY  \n2. ARRAY LIST \n3. TRESS SET \n4. HASH MAP");
		System.out.println("ENTER CODE : ");
		Scanner scan = new Scanner(System.in);
		code = scan.nextInt();
		pizzaStore = (PizzaStore) PizzaStoreFactory.getPizzaStore(code);
		System.out.println("ENTER SIZE : ");
		
		scan.close();
	}

	public void addPizzaDetailsAndStore(Pizza pizza) throws PizzaAlreadyExistsException, NoPizzaFoundException {
		pizzaStore.addnewPizza(pizza);
	}

	public void displayPizzaDetailsbyName() throws NoPizzaFoundException {
		Pizza pizza = pizzaStore.getPizzaByName(pizzaName);
		System.out.println(pizza.toString());
	}

	public void printPizzaNamesBySize() throws NoPizzaFoundException {
		Scanner scan = new Scanner(System.in);
		
		//int pizzaSizeInCms = scan.nextInt();
		List<Pizza> getPizza = pizzaStore.getPizzaNamesBySize(pizzaSizeInCms);
		for (Pizza p : getPizza) {
			System.out.println(p.getPizzaName());
		}
	}

	public void displayPizzaDetails(Pizza pizza) {
		System.out.println(pizza.toString());
	}

	public void displayAllPizzaDetails() {
		pizzaStore.displayAllPizzas();
	}
}
