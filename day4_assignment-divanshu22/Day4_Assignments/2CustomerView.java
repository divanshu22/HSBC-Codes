package com.hsbc.Day4;

public class CustomerView implements CustomerService {

	private PizzaStore piz;

	public CustomerView() {
		PizzaStoreFactory factory = new PizzaStoreFactory();
		piz = factory.getStoreInstance();
	}

	@Override
	public Pizza addPizzaDetailsandStore(Pizza pizza) {
		String pn= piz.addNewPizza(pizza);
		Pizza enterp = pizza.getPizzaByName(pn);
		return enterp;
	}

	@Override
	public String displayPizzaDetailsByName(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int printPizzaNamesBySize(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
