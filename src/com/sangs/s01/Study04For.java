package com.sangs.s01;

import java.util.Scanner;

public class Study04For {
	public static void main(String[]args) {
		/*
  		1.로그인
  		- 1.로그인  2.종료 
	 	- ID / PW /  무제한
  		 
  		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
  		2.MMORPG
		 레벨 1 시작 
		 1 >2  : 3마리    
		 2 >3  : 6마리
		 3 >4  : 9마리
		14 >15 : 42마리 종료
		 골드 0     , 레벨 5레벨 달성시 1000골드 지급   10 > 2000 , 15 > 3000
		 *
		 */
		Scanner sc = new Scanner(System.in); 
		int coin = 0;
		int ID = 0;
		int PW = 0;
		int idche = 123;
		int pwche = 123;
		int level = 1;
		int gold = 0;
		int contents = 1;
		int exp;
		int maxlevel = 15;
		boolean login = false;
		while(coin==0) {
			System.out.println("로그인 : 0 , 종료는 1번");
			coin = sc.nextInt();
			if(coin==1) {
				System.out.println("게임을 종료합니다.");
				break;
			}else if(coin==0) {
			System.out.println("ID를 입력하세요.");
			ID = sc.nextInt();
			System.out.println("PW를 입력하세요.");
			PW = sc.nextInt();
			if(ID==idche && PW==pwche) {
				coin = 2;
				System.out.println("로그인에 성공하였습니다!!");
				login=true;
			}
			}
			else {
				System.out.println("다시 입력해");
				coin=0;
				
			}
		if(login) {
			System.out.println("게임에 접속하였습니다.");
			System.out.println("당신의 레벨은 " + level +"입니다.");
			exp = level*3;
			
			System.out.println("필요 경험치는 : "+exp+"입니다");
			
			while(contents == 1) {
			System.out.println("무엇을 하시겠습니까 사냥 : 1   종료 : 2 ");
			contents = sc.nextInt();
			if(contents==2) {
				System.out.println("게임을 종료하였씁니다.");
			}
			else {
			for(int i=1; i<=exp;i++) {
				System.out.println(i+"마리 잡았습니다.");
				
				
			}
			level++;
			if(level ==5 ) {
				gold += 1000;
			}
			if(level ==10)
			{
				gold+=2000;
			}
			if(level==15) {
				gold+=3000;
			}
			System.out.println("레벨업 축하합니다! 현재 레벨 : " + level);
			System.out.println("현재 보유 골드는 : " + gold + " 입니다.");
			exp = level *3;
			if(level == 15) {
				System.out.println("최고레벨달성!!!최고레벨달성!!!최고레벨달성!!!최고레벨달성!!!최고레벨달성!!!최고레벨달성!!!최고레벨달성!!!최고레벨달성!!!최고레벨달성!!!최고레벨달성!!!최고레벨달성!!!최고레벨달성!!!최고레벨달성!!!최고레벨달성!!!");
				while(maxlevel<=15) {
				System.out.println("max레벨을 입력해주세요");
				maxlevel = sc.nextInt();
				}
				while(contents==1) {
					System.out.println("추가적으로 레벨을 올리시겠습니까?");
					System.out.println("사냥 : 1   종료 : 2");
					contents = sc.nextInt();
					if(contents==1) {
					for(int i=1;i<=exp;i++) {
						System.out.println(i + "마리 잡았습니다.");
					}
					level++;
					exp =level*3;
					System.out.println("레벨업! 현재레벨은 " + level);
					}
					else if(contents==2) { System.out.println("게임을 종료합니다. 안녕히가세요");
					System.out.println("현재 레벨은 " + level + " 현재 보유 골드 : " + gold);
					}
					if(maxlevel==level) contents = 3;
			}
			}
		}
		
			
			
			}
		}
			
			
		}
		
		
		
		
		
	}
}







//