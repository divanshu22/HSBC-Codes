package com.hsbc.factory;

import com.hsbc.dao.PizzaListStoreImpl;
import com.hsbc.dao.PizzaMapStoreImpl;
import com.hsbc.dao.PizzaSortedStoreImpl;
import com.hsbc.dao.PizzaStoreImpl;

public class PizzaStoreFactory {
	public static Object getPizzaStore(int code) {
		if(code == 1) {
			PizzaStoreImpl pizzaStoreImpl = new PizzaStoreImpl();
			return pizzaStoreImpl;
		}
		else if(code == 2) {
			PizzaListStoreImpl pizzaListStoreImpl = new PizzaListStoreImpl();
			return pizzaListStoreImpl;
		}
		else if(code == 3) {
			PizzaSortedStoreImpl pizzaSortedStoreImpl = new PizzaSortedStoreImpl();
			return pizzaSortedStoreImpl;
		}
		else {
			PizzaMapStoreImpl pizzaMapStoreImpl = new PizzaMapStoreImpl();
			return pizzaMapStoreImpl;
		}
		
		
	}
}
