package com.sangs.s03;

import java.util.Scanner;

public class SchoolService {
	public Student[] makeStudents(int students1) {
		//학생 수 입력받아서 수만큼 학생정보입력
		Scanner sc = new Scanner(System.in);
		
		Student []a = new Student[students1];
		
		for(int i=0;i<students1;i++) {
			a[i] = new Student();
			System.out.println(i+1+"번째 학생의 학점을 입력하시오.");
			a[i].grade = sc.nextDouble();
			System.out.println(i+1+"번째 학생의 이름을 입력하시오.");
			a[i].name = sc.next();
			System.out.println(i+1+"번째 학생의 번호를 입력하시오.");
			a[i].num =sc.nextInt();
		
		}
		
			
		return a;	
			
		
		}
		
	public void outputStudents(Student [] students) {
		
		for(int i=0;i<students.length;i++) {
			System.out.println(i+1+"번쨰 학생의 이름 : " + students[i].name );
			System.out.println(i+1+"번쨰 학생의 번호 : " + students[i].num );
			System.out.println(i+1+"번쨰 학생의 학점 : " + students[i].grade );
			System.out.println("=============================");
			
		
	}
	

	}
	
	public Student serchStudent(Student [] student,int num) {
		
//		System.out.println(num+1+"번째 학생의 정보 ");
//		System.out.println("이름 : "+student[num].name);
//		System.out.println("번호 : "+student[num].num);
//		System.out.println("학점 : "+student[num].grade);
//		
		if(student.length<num) {
			return null;
		}
		else if(num <0) return null;
		else
		return student[num];
	}
	
	public Student[] addStudent(Student[] a) {
		Scanner sc = new Scanner(System.in);
		int ab = a.length;
		Student[] temp = new Student[ab+1];
		
		for(int i=0;i<ab;i++) {
			temp[i] = new Student();
			temp[i] = a[i];
		}
		temp[ab] = new Student();
		System.out.println("추가할 이름을 입력하시오.");
		temp[ab].name = sc.next();

		System.out.println("추가할 번호를 입력하시오.");
		temp[ab].num = sc.nextInt();

		System.out.println("추가할 학점을 입력하시오.");
		temp[ab].grade = sc.nextDouble();
		
		return temp;
	}
}
