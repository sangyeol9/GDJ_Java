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
	
	public void serchStudent(Student [] student,int num) {
		
		System.out.println(num+1+"번째 학생의 정보 ");
		System.out.println("이름 : "+student[num].name);
		System.out.println("번호 : "+student[num].num);
		System.out.println("학점 : "+student[num].grade);
		
	}
	
	public void hiyo(Student [] student) {
		for(int i=0; i<student.length ;i++)
		{
		Student [] temp = new Student[student.length];
		temp[i] = student[i];
		System.out.println(temp[i].grade);
	}

		for(int i=0;i<student.length;i++) {
			System.out.println(student[i].grade);
			
		}
		
	}
	
}
