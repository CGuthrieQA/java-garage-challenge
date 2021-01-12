package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		Vehicle car1 = new Car();
		Vehicle motorbike1 = new Motorbike();
		Vehicle bus1 = new Bus();
		
		Garage garageManager = new Garage();
		
		garageManager.addVehicle(car1);
		garageManager.addVehicle(motorbike1);
		garageManager.addVehicle(bus1);
		
		garageManager.calculateBill();
		
		garageManager.removeByType("car");
		
		garageManager.fixByType("bus");
		
		garageManager.emptyGarage();

	}

}
