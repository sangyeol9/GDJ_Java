package com.sang.s03.ex;

public class Detail extends Ex{

	public void ddd(Ex[] b, int c) {
		Ex a;
		int d= c;
		c -=1;
		a=b[c];
		
		System.out.println(d + "번째 번호 : " + a.getNumber());
		System.out.println(d + "번째 이름 : " + a.getName());
		System.out.println(d + "번째 회사명 : " + a.getCname());
		System.out.println(d + "번째 직급 : " + a.getGrade());
		System.out.println(d + "번째 전화번호 : " + a.getNum());
		System.out.println(d + "번째 emali : " + a.getEmail());
		System.out.println(d + "번째 주소 : " + a.getAddr());
		
	
	}
	
}
