package com.sangs.s04.util.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
	private Scanner sc;
	private StudentService studentService;
	private StudentView view;
	public StudentController() {
		this.sc = new Scanner(System.in);
		this.studentService = new StudentService();
		this.view = new StudentView();
	}
	
	public void start() {
		int coin=0;
		ArrayList<Student> ar =  this.studentService.init();
		
		
		while(coin==0) {
			System.out.println("1.학생정보출력 2.이름검색 3.추가 4.삭제  6.종료");
			int content = this.sc.nextInt();
			if(content ==1) {
				view.view(ar);
			}
			else if(content == 6) {
				coin=1;
			}
			
			
		}
	}
	
}
