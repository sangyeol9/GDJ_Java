package com.sang.s03.ex;

import java.util.Scanner;

public class Add extends Ex {
	Scanner sc = new Scanner(System.in);
	
	
	
	
	
	
	public Ex[] ddd(Ex []aaa) {
		
		Ex [] bbb = null;
	
		int c;
		if(aaa==null) {
			c=0;
			bbb = new Ex[1];
		
		}
		else {
			c = aaa.length;
			bbb=new Ex[c+1];
			for(int i=0; i<c;i++) {
				 bbb[i] = new Ex();
				bbb[i]=aaa[i];
			}
		}
		
		bbb[c] = new Ex();
		String a ;
		int b;
		System.out.println("번호를 입력하세요");
		b=sc.nextInt();
		bbb[c].setNumber(b);
		System.out.println("회사명을 입력하씨오");
		a=sc.next();
		bbb[c].setCname(a);
		System.out.println();
		System.out.println("이름을 입력하세요");
		a=sc.next();
		bbb[c].setName(a);
		System.out.println("직책을 입력하시오");
		a=sc.next();
		bbb[c].setGrade(a);
		System.out.println("전화번호를 입력하시오");
		b=sc.nextInt();
		bbb[c].setNum(b);
		System.out.println("Email을 입력하시오");
		a=sc.next();
		bbb[c].setEmail(a);
		System.out.println("주소를 입력하시오");
		a=sc.next();
		bbb[c].setAddr(a);
		
		return bbb;
	}
}
