package com.qa.garagetask;

public class Car extends Vehicle {
	
	String color;
	Boolean isConvertible;
	

	public Car(String make, String model, int year, String color, Boolean isConvertible) {
		super(make, model, year);
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
