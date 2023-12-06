package com.sangs.s03;

import java.util.Scanner;

public class SchoolMain {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	Student[] stu = null;

//	stu.name="winter";
//	stu.num = 1;
//	stu.grade = 1.5;
//	
//	Student stu2 = new Student();
//	stu2.name="winter";
//	stu2.num = 1;
//	stu2.grade = 1.5;
//	
//	Student stu3 = new Student();
//	
//	
//	Student [] students = new Student[2] ;
//	students[0] = stu;
//	students[1] = new Student();
//	System.out.println(students[0].name);
	int person;
	System.out.println("학생 수 입력");
	person = sc.nextInt();
	stu = new Student[person];
	
	for(int i=0;i<person;i++) {
//		stu[i] = new Student();
//		System.out.println(i+1+"번째 학생의 번호 입력");
//		stu[i].num = sc.nextInt();
//		System.out.println(i+1+"번째 학생의 이름 입력");
//		stu[i].name = sc.next();
//		System.out.println(i+1+"번째 학생의 점수 입력");
//		stu[i].grade = sc.nextDouble();
//		
		Student s = new Student();
		System.out.println(i+1+"번째 학생의 번호 입력");
		s.num = sc.nextInt();
		System.out.println(i+1+"번째 학생의 이름 입력");
		s.name = sc.next();
		System.out.println(i+1+"번째 학생의 점수 입력");
		s.grade = sc.nextDouble();
		System.out.println(s.name + " " + s.num + " " + s.grade);
		
		//System.out.println(stu[i].name + " " + stu[i].num + " " +stu[i].grade);
	}
	
}
}
