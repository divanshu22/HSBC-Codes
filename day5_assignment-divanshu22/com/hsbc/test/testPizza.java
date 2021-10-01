package com.hsbc.test;

import java.util.Date;

import com.hsbc.model.Pizza;
import com.hsbc.service.CustomerView;

public class testPizza {

	public static void main(String[] args) {
		CustomerView customerView = new CustomerView();

		try {
			Pizza p1 = new Pizza("ONION TOMATO CAPSICUM", "ONION", "TOMATO", "CAPSICUM", 12, 100, 200, new Date());
			customerView.addPizzaDetailsAndStore(p1);
			customerView.displayPizzaDetails(p1);

			Pizza p2 = new Pizza("CHEESE MUSHROOM", "CHEESE", "MUSHROOM", "NONE", 9, 150, 200, new Date());
			customerView.addPizzaDetailsAndStore(p2);
			customerView.displayPizzaDetails(p2);

			Pizza p3 = new Pizza("FARM HOUSE", "CHEESE", "MUSHROOM", "TOMATO", 11, 200, 300, new Date());
			customerView.addPizzaDetailsAndStore(p3);
			customerView.displayPizzaDetails(p3);

			Pizza p4 = new Pizza("MEXICAN GREEN WAVE", "ONION", "CAPSICUM", "MUSHROOM", 10, 400, 500, new Date());
			customerView.addPizzaDetailsAndStore(p4);
			customerView.displayPizzaDetails(p4);

			Pizza p5 = new Pizza("GOLDEN CORN", "CHEESE", "CORN", "NONE", 13, 150, 100, new Date());
			customerView.addPizzaDetailsAndStore(p5);
			customerView.displayPizzaDetails(p5);

			System.out.println("PIZZA DETAILS(NAME) : ");
			customerView.displayPizzaDetailsbyName();
			System.out.println("PIZZA DETAILS(SIZE) : ");
			customerView.printPizzaNamesBySize();

			// customerView.displayAllPizzaDetails();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
