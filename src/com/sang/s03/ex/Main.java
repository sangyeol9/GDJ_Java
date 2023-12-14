package com.sang.s03.ex;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int content=0; 
		int coin=0;
		Ex ex = new Ex();
		Menu menu = new Menu();
		Add add = new Add();
		Ex [] ex1 = null;
		Delete del = new Delete();
		Detail det = new Detail();
		Arr arr = new Arr();
		Fix fix = new Fix();
		
		while (coin==0) {
			menu.menu();
			content = sc.nextInt();
		if(content == 1 )
		ex1 = add.ddd(ex1);
		else if(content==2) {
			System.out.println("수정 할 번호를 입력하씨오");
			int d = sc.nextInt();
			d -=1;
			ex1[d]=fix.ddd(ex1,d);

		}
		
		else if(content ==3 ) {
			System.out.println("삭제 할 번호를 입력하씨오");
			int d = sc.nextInt();
		
			ex1=del.bbb(ex1,d);
			
		}
		else if(content ==4) {
			arr.aaa(ex1);
			
		}
		else if (content ==5 ) {
			int d;
			System.out.println("검색 할 번호를 입력하시오");
			d = sc.nextInt();
			det.ddd(ex1,d);
		
//				
			
		}
		else if(content == 6)
		{
			coin=1;
		}
		else System.out.println("번호를 다시 입력하씨오");
		
		}
	}
}
