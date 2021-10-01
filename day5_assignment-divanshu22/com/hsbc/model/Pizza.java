package com.hsbc.model;

import java.util.Date;


import java.util.Objects;
/*
 * 
 * Implemented comparable
 * 
 * 
 */
public class Pizza implements Comparable<Pizza>{
	
	private String pizzaName, majorIngredientOne, majorIngredientTwo, majorIngredientThree;
	private int sizeInCms;
	private float weight, price;
	private Date insertionDate;

	public int hashCode() {
		return Objects.hash(insertionDate, majorIngredientOne, majorIngredientThree, majorIngredientTwo, pizzaName,
				price, sizeInCms, weight);
	}

	public boolean equals(Pizza pizza) {
		if (this == pizza)
			return true;
		if (pizza == null)
			return false;
		if (getClass() != pizza.getClass())
			return false;
		Pizza other = (Pizza) pizza;
		return Objects.equals(insertionDate, other.insertionDate)
				&& Objects.equals(majorIngredientOne, other.majorIngredientOne)
				&& Objects.equals(majorIngredientThree, other.majorIngredientThree)
				&& Objects.equals(majorIngredientTwo, other.majorIngredientTwo)
				&& Objects.equals(pizzaName, other.pizzaName)
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price) && sizeInCms == other.sizeInCms
				&& Float.floatToIntBits(weight) == Float.floatToIntBits(other.weight);
	}

		
	public Pizza() {
	}

	public Pizza(String pizzaName, String majorIngredientOne, String majorIngredientTwo, String majorIngredientThree,
			int sizeInCms, float weight, float price, Date insertionDate) {
		this.pizzaName = pizzaName;
		this.majorIngredientOne = majorIngredientOne;
		this.majorIngredientTwo = majorIngredientTwo;
		this.majorIngredientThree = majorIngredientThree;
		this.sizeInCms = sizeInCms;
		this.weight = weight;
		this.price = price;
		this.insertionDate = insertionDate;
	}

	public String getPizzaName() {
		return pizzaName;
	}

	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}

	public String getMajorIngredientOne() {
		return majorIngredientOne;
	}

	public void setMajorIngredientOne(String majorIngredientOne) {
		this.majorIngredientOne = majorIngredientOne;
	}

	public String getMajorIngredientTwo() {
		return majorIngredientTwo;
	}

	public void setMajorIngredientTwo(String majorIngredientTwo) {
		this.majorIngredientTwo = majorIngredientTwo;
	}

	public String getMajorIngredientThree() {
		return majorIngredientThree;
	}

	public void setMajorIngredientThree(String majorIngredientThree) {
		this.majorIngredientThree = majorIngredientThree;
	}

	public int getSizeInCms() {
		return sizeInCms;
	}

	public void setSizeInCms(int sizeInCms) {
		this.sizeInCms = sizeInCms;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public Date getInsertionDate() {
		return insertionDate;
	}

	public void setInsertionDate(Date insertionDate) {
		this.insertionDate = insertionDate;
	}
	
	
	public String toString() {
		return "Pizza [PIZZA NAME  = " + pizzaName + ", INGR ONE = " + majorIngredientOne + ", INGR TWO = "
				+ majorIngredientTwo + ", INGR THREE = " + majorIngredientThree + ", SIZE  = " + sizeInCms
				+ ", WEIGHT = " + weight + ", PRICE  = " + price + ", DATE = " + insertionDate + "]";
	}

	public void preparation() {
		System.out.println("THIS IS HOW  " + pizzaName + "IS PREPARED");
	}

	public int compareTo(Pizza pizza) {
		return this.getPizzaName().compareTo(pizza.getPizzaName());
	}

}
