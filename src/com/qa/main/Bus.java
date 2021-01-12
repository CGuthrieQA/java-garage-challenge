package com.qa.main;

public class Bus extends Vehicle {
	
	protected boolean doubleDecker = true;

	@Override
	public int wheels() {
		return 6;
	}

	@Override
	public int seats() {
		return 100;
	}

	@Override
	public String color() {
		return "red";
	}

	@Override
	public String toString() {
		return "Bus [doubleDecker=" + doubleDecker + ", wheels()=" + wheels() + ", seats()=" + seats() + ", color()="
				+ color() + "]";
	}

	@Override
	public String type() {
		return "bus";
	}
	
}
