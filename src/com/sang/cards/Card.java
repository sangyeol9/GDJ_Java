package com.sang.cards;

public class Card {
	private int num;
	private String shape;
	private String color;
	public static int size;
	
	public Card() {
		
	}
	
	public Card(int size,int num,String shape,String color) {
		Card.size = size;
		this.num =num;
		this.shape = shape;
		this.color = color;
		
	}
	
	public void info() {
		System.out.println("num : " + this.num);
		System.out.println("shape : " + this.shape);
		System.out.println("color : " + this.color);
		System.out.println("size : " + Card.size);
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	
}
