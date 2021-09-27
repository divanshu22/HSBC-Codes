package com.hsbc.Day4;

public class PizzaStoreFactory {
	
	public PizzaStore getStoreInstance() {
		return new PizzaStoreImpl();
	}
	
	public CustomerService getServiceInstance() {
		return new CustomerView();
	}

}
