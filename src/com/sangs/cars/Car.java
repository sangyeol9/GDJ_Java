package com.sangs.cars;

public class Car {
	String company;
	String name;
	String fuel;
	String color;
	int price;
	int cc;
	
	//기본생성자, 디폴트생성자, 빈생성자
	public Car() {
	this("Bl0ack");
	}
	public Car(String color) {
		company = "Kia";
		name = "K5";
		fuel = "Gas";
		this.color = color;
		price = 3000;
		cc = 2000;

	}
	
	public Car(String name,String color) {
		
		company = "Kia";
		this.name = name;
		fuel = "Gas";
		this.color = color;
		price = 3000;
		cc = 2000;

		
	}
	
	public void info() {
		System.out.println("Company : "+this.company);
		System.out.println("Name : " + this.name);
		System.out.println("Fuel : " + this.fuel);
		System.out.println("Color : " + this.color);
		System.out.println("Price : " + this.price);
		System.out.println("CC : " + this.cc);
	}
	
}
