package com.sangs.marin;

public class Marin {

	int hp=100;
	Gun gun;

	public Marin() {
		System.out.println("생성자");	
		this.hp = 200;
		this.gun = new Gun();
		
	}

}
