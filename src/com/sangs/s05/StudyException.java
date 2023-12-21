package com.sangs.s05;

import java.util.Scanner;

public class StudyException {

	
	public void t1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		int num = sc.nextInt();
		int num2 = 9;
		
		System.out.println(num2/num);
		
		StudyException2 se2 = new StudyException2();
		se2.t2();
		
	}
}
