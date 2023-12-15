package com.sangs.s04.util.ex1;

import java.util.ArrayList;

public class StudentView {
//학생들의 모든 정보를 출력
	
	//메시지를 출력
	public void view(String message) {
		
	}
	
	//학생 한명의 모든 정보
	public void view1(Student stu) {
		
	}
	
	
	//향상된 for문
	//for(모은데이터타입명 변수명:collection변수명){}
	public void view(ArrayList<Student> ar) {
		
//		for(Student student:ar) {
//			System.out.println(student.getName());
//		}
		
		for(int i=0;i<ar.size();i++) {
			System.out.print(ar.get(i).getName() + "/ ");
			System.out.print(ar.get(i).getNum() + "번 / 국어 :");
			System.out.print(ar.get(i).getGuk() + " / 수학 :");
			System.out.print(ar.get(i).getMath() + " / 영어 :");
			System.out.print(ar.get(i).getEng() + " / 총점 :");
			System.out.print(ar.get(i).getSum() + " / 평균 :");
			System.out.print(ar.get(i).getAb() + "\n");
		
		}
		
	}
}
