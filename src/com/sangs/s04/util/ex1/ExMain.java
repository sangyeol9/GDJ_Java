package com.sangs.s04.util.ex1;

import java.util.ArrayList;

public class ExMain {
	public static void main(String[] args) {
		StudentService service = new StudentService();
		ArrayList<Student> stu = new ArrayList<Student>();
		StudentView studentView = new StudentView();
		
		
		
		new StudentController().start();
		
	}
}
