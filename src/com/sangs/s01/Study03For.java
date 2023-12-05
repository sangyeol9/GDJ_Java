package com.sangs.s01;

import java.util.Scanner;

public class Study03For {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		// 0 - 59분    0 - 59 초
		System.out.println("분을 입력하세요.");
		int hour = sc.nextInt();
		System.out.println("초를 입력하세요");
		int min =sc.nextInt();
		boolean check = false;
		for(int i=0; i<60;i++) {
			
			for(int j=0; j<60;j++)
			{
				if(hour == i && j==min) {
					check = true;
					System.out.println(i+"분 "+j+"초 가 되었습니다.");
				}
				if(check) break;
					
			}
			
		}
	
	
		
		
		
	}
}
