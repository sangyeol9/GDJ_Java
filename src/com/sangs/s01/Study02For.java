package com.sangs.s01;

import java.util.Scanner;

public class Study02For {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int id=1234;
		int pw = 5678;
		
		//id pw 입력
		boolean  check;
		String hi = " ";
		
		for(int i=1;i<6;i++) {	
		System.out.println("=========="+i+"번째 로그인 시도 ========");
		System.out.println("ID를 입력하세요");
		int idchk = sc.nextInt();
		System.out.println("PW를 입력하세요.");
		int pwchk = sc.nextInt();
		if(idchk == id ) {
			if(pwchk==pw) {
				check = true;
				hi = "로그인 성공!!!";
				break;
			}
		}
		if(i==5) {
			check = false;
			hi = "로그인 실패!!";
		}
		
		
		}
		System.out.println(hi);
	}
}
