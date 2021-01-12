package com.qa.main;

public class Car extends Vehicle {
	
	protected int age = 6;

	@Override
	public int wheels() {
		return 4;
	}

	@Override
	public int seats() {
		return 5;
	}

	@Override
	public String color() {
		return "silver";
	}

	@Override
	public String toString() {
		return "Car [age=" + age + ", wheels()=" + wheels() + ", seats()=" + seats() + ", color()=" + color() + "]";
	}

	@Override
	public String type() {
		return "car";
	}
	
	

}
