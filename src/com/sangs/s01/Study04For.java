package com.sangs.s01;

import java.util.Scanner;

public class Study04For {
	public static void main(String[]args) {
		
		//30 * 3 / 1. 단발 , 2점사 
		
		Scanner sc = new Scanner(System.in);
		int k = 0;
		int shot =0;
		for(int i=1;i<=3;i++) {
			k=0;
			while(k==0) {
			System.out.println("사격 방식을 선택해주세요. 1:단발 2:점사");
			 shot = sc.nextInt();
			if(shot==1 || shot ==2) {
				k=1;
			}
			}
			for(int j=1;j<=30;j++) {
				if(shot == 1 ) {
					System.out.println("탕");
				}
				else if(shot == 2) {
					System.out.println("탕탕탕");
					j = j+2;     
				}
			}
			
			if(i<3)
			System.out.println(i+"번째 탄창 소모 =====재장전중입니다=====");
			else
				System.out.println("탄이 없습니다~");
		}
		
		
	}
}
