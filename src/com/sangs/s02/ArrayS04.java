package com.sangs.s02;

import java.util.Scanner;

public class ArrayS04 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	// 1. 학생정보생성
	// - 학생 수 입력 / 학생 수 만큼 이름 , 번호 ,학점
	// 2. 학생정보출력
	// 3. 학생정보검색
	// - 검색 할 학생 번호 입력받아서 해당 학생의 정보를 출력
	// 4. 학점 높은애 먼저 출력
	// 5. 종료
	int coin = 0;
	int person = 0;
	int content =0;
	int check=0;
	String[] tempname = new String[1];
	int[] tempnum = new int[1];
	double[] tempgrade = new double[1];
	
	
	String [] name1 =null;
	int [] num1  =null;
	double [] grade1 = null;
	
	
	String [] name ;
	int [] num ;
	double [] grade;
	
	String tempS;
	int tempI;
	double tempD;
	
	
	while(coin ==0) {
	
		
		System.out.println("1.학생정보생성 2.정보출력 3.정보검색 4.성적순출력 5.종료");
		content = sc.nextInt();	
	
		if(content==1) {
		System.out.println("학생 수를 입력하세요");
		person = sc.nextInt();
		name = new String[person];
		num = new int[person];
		grade = new double[person];
		name1 = new String[person];
		num1 = new int[person];
		grade1 = new double[person];
		for(int i=0; i<person;i++) {
			System.out.println(i+"번 학생 ===========================");
			System.out.println(i+"번째 학생의 이름을 입력하세요");
			name[i] = sc.next();
			tempname=name;
			System.out.println(i+"번째 학생의 번호을 입력하세요");
			num[i] = sc.nextInt();
			tempnum=num;
			System.out.println(i+"번째 학생의 학점을 입력하세요");
			grade[i] = sc.nextDouble();
			tempgrade=grade;
		}
		check = 1;
		}
	
	
		
		else if(content==2) {
			if(check==1) {
		for(int i=0;i<person;i++) {
		System.out.println(i+"번 학생의 정보 ======================"   );
		System.out.println(i+"번 학생의 이름 : " + tempname[i] );
		System.out.println(i+"번 학생의 번호 : " + tempnum[i]  );
		System.out.println(i+"번 학생의 학점 : " + tempgrade[i]  );
		}
		}
			else System.out.println("error");
	}
	 else if(content==3) {
		 if(check==1) {
		 System.out.println("검색 할 학생의 번호를 검색하세요");
		 int serch = sc.nextInt();
		 int a=-3;
		for(int i=0;i<person;i++) {
			if(serch == tempnum[i]) {
				a=i;
			}
		}
		if(a!= -3) {
		System.out.println(a+"번 학생의 정보 ======================"   );
		System.out.println(a+"번 학생의 이름 : " + tempname[a] );
		System.out.println(a+"번 학생의 번호 : " + tempnum[a]  );
		System.out.println(a+"번 학생의 학점 : " + tempgrade[a]  );
	 }
		 else {
			 System.out.println("검색한 학생의 정보가 없습니다. ");
		 }}
		 else System.out.println("error");
	}
		
	 else if(content==4) {
		 if(check==1) {
		 for(int i=0;i<person;i++) {
			 num1[i] = tempnum[i];
			 grade1[i] = tempgrade[i];
			 name1[i] = tempname[i];
		 }
		 	for(int i =0;i<person;i++) {
	 		for(int j=i+1; j<person;j++) {
	 		if(grade1[i]<grade1[j]) {
	 			tempD=grade1[i];
	 			grade1[i] = grade1[j];
	 			grade1[j] = tempD;
	 			
	 			tempI=num1[i];
	 			num1[i] = num1[j];
	 			num1[j] = tempI;
	 			
	 			tempS=name1[i];
	 			name1[i] = name1[j];
	 			name1[j] = tempS;
	 			                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
	 			
	 		}
	 		}
	 		System.out.println("성적순 출력! ======================"   );
			System.out.println(i+1+"등 학생의 이름 : " + name1[i] );
			System.out.println(i+1+"등 학생의 번호 : " + num1[i]  );
			System.out.println(i+1+"등 학생의 학점 : " + grade1[i]  );
	 	}
		 }else System.out.println("error");
		 

		 
	 }
	
	 else if(content==5)
	 {
		 System.out.println("종료되었습니다.");
		 coin =1;
	 }
	 else {
		 System.out.println("1~5사이의 숫자를 입력하세요");
	 }
		
	}
}
}
