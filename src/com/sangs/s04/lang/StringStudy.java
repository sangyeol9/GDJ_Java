package com.sangs.s04.lang;

import java.util.Scanner;

public class StringStudy {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String name = "winter";
		System.out.println(name.charAt(3));
		String name2 = "winter";
		
		System.out.println(name == name2);
		System.out.println("이름 입력");
		String name3 = sc.next();
		System.out.println(name==name3);
		
		
		
	}
	
}
