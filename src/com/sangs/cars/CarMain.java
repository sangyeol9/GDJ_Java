package com.sangs.cars;

public class CarMain {
	public static void main(String[] args) {
		
	Car car = new Car();
	Car car2 = new Car ("White");
	Car car3 = new Car("K9", "green");
	
	
	car.info();
	
	car2.info();
	car3.info();
	
	}
}
