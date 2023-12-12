package com.sang.cards;

public class CardMain {
	public static void main(String[] args) {
		Card card = new Card(10,1,"Dia","red");
		card.info();
		Card card2 = new Card(10,1,"heart","red");
		

//		클래스 변수
		Card.size =5;
		
		card2.info();
		card.info();
		
	}
}
