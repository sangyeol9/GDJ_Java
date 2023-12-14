package com.sang.s03.ex;

import java.util.Scanner;

public class Fix extends Ex {

	Scanner sc = new Scanner(System.in);
	
	public Ex ddd(Ex[] a,int num) {
		Ex b = new Ex();
		int c;
		String d;
		System.out.println("번호를 입력하세요");
		c=sc.nextInt();
		a[num].setNumber(c);
		System.out.println("회사명을 입력하씨오");
		d=sc.next();
		a[num].setCname(d);
		System.out.println();
		System.out.println("이름을 입력하세요");
		d=sc.next();
		a[num].setName(d);
		System.out.println("직책을 입력하시오");
		d=sc.next();
		a[num].setGrade(d);
		System.out.println("전화번호를 입력하시오");
		c=sc.nextInt();
		a[num].setNum(c);
		System.out.println("Email을 입력하시오");
		d=sc.next();
		a[num].setEmail(d);
		System.out.println("주소를 입력하시오");
		d=sc.next();
		a[num].setEmail(d);
		
		b = a[num];
		
		
		
		return  b;
	}
	
}
