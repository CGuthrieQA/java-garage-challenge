package com.qa.main;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	public List<Vehicle> vehicleList = new ArrayList<>();	
		
	public void calculateBill() {
		
		for ( Vehicle i : vehicleList ) {
			
			int bill = 0;
			
			switch(i.type()) {
				case "car": 
					bill = 1 * i.seats() * i.wheels();
					break;
				case "motorbike": 
					bill = 2 * i.seats() * i.wheels();
					break;
				case "bus": 
					bill = 3 * i.seats() * i.wheels();
					break;
			}
			
			System.out.println(i + " Bill: £" + bill);
			
		}
		
	}
	
	public void addVehicle(Vehicle vehicle) {
		vehicleList.add(vehicle);
	}
	
	public void removeByType(String type) {
		
		// create a placeholder list
		List<Vehicle> removeList = new ArrayList<Vehicle>();
		
		for ( Vehicle i : vehicleList) {
			
			
			if ( i.type().equals(type) ) {
				System.out.println("Removing vehicle " + i);
			} else {
				removeList.add(i);
			}
			
		}	
		
		vehicleList = removeList;
		System.out.println(vehicleList);
		
	}
	
	public void fixByType(String type) {
		
		for ( Vehicle i : vehicleList ) {
			
			int bill = 0;
			
			if(i.type().contentEquals(type)) {
				bill = i.seats() * i.wheels();
				System.out.println(i + " Bill: £" + bill);
			} 
			
		}
		
	}
	
	public void emptyGarage() {
		
		vehicleList.clear();
		
		System.out.println("Garage is empty! " + vehicleList);
		
	}
	
}
