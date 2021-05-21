package com.qa.garagetask;

public class Car extends Vehicle {
	
	private String color;
	private Boolean isConvertible;
	

	public Car(String make, String model, int year, String color, Boolean isConvertible, Double price) {
		super(make, model, year, price);
		this.color = color;
		this.isConvertible = isConvertible;
		
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Boolean getIsConvertible() {
		return isConvertible;
	}


	public void setIsConvertible(Boolean isConvertible) {
		this.isConvertible = isConvertible;
	}

	
		
}
