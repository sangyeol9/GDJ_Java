package com.sangs.s03;

import java.util.Scanner;

public class SchoolControler {
	public void start() {
		SchoolService service = new SchoolService();
		Scanner sc = new Scanner(System.in);
		Student [] a = null;
		
		int coin =0;
		int content =0;
		while(coin==0) {
			System.out.println("1.학생정보입력, 2.정보출력 , 3.정보검색, 4.학점정렬, 5.프로그램종료");
			content = sc.nextInt();
			if(content==1) {
				System.out.println("학생수를 입력하시오");
				int students = sc.nextInt();
	    	a = service.makeStudents(students);
			}
			else if(content ==2 ) {
				service.outputStudents(a);
			}
			else if(content ==3) {
				int num = 0;
				System.out.println("검색할 학생의 번호를 입력하세요");
				num = sc.nextInt();
				num = num-1;
				service.serchStudent(a,num);
				
			}
			else if(content ==4) {
				
				service.hiyo(a);
				
			}
			else if(content == 5) {
				coin=1;
			}
			
		}
		
		
		
	}
	
	
}
