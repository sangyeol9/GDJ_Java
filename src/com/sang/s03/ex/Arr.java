package com.sang.s03.ex;

public class Arr extends Ex {

	public void aaa (Ex[] ex1) {
		
		
		for(int i=0; i<ex1.length;i++) {
			System.out.println(i+1 + "번째 번호 : " + ex1[i].getNumber());
			System.out.println(i+1 + "번째 이름 : " + ex1[i].getName());
			System.out.println(i+1 + "번째 회사명 : " + ex1[i].getCname());
		}
		
	}
	
}
