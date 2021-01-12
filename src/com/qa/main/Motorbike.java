package com.qa.main;

public class Motorbike extends Vehicle {
	
	protected boolean isScooter = false;

	@Override
	public int wheels() {
		return 2;
	}

	@Override
	public int seats() {
		return 1;
	}

	@Override
	public String color() {
		return "yellow";
	}

	@Override
	public String toString() {
		return "Motorbike [isScooter=" + isScooter + ", wheels()=" + wheels() + ", seats()=" + seats() + ", color()="
				+ color() + "]";
	}

	@Override
	public String type() {
		return "motorbike";
	}
	
	

}
