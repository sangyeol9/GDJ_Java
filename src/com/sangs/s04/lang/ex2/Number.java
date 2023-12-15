package com.sangs.s04.lang.ex2;

import java.util.Scanner;

public class Number {
	Scanner sc = new Scanner(System.in);
	Age age = new Age();
	Check check = new Check();
	
	Month month = new Month();
	
	Gender gender = new Gender();
	
	
	public void Nuber() {
		
		int coin=0;
		String[] a = {"0"};
		while(coin==0) {
		System.out.println("주민번호 입력 , 종료원할시 0");
		String pnum = sc.next();
		if(pnum.length()==14) {
			if(pnum.indexOf("-")==6) {
		String [] num ;
		num = gender.gender(pnum);
		age.age(num);
		month.month(num);
		check.check(num);
		coin=1;
		
			}
			
		}
		else if(pnum.equals("0")) break;
		}
	
		
		}
	
}
