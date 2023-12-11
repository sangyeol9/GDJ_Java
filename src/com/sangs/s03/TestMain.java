package com.sangs.s03;

public class TestMain {
	public static void main(String[] args) {
		Test test = new Test();
		
		test.t1();
		int n=10;
		test.t2(n, 20);
		
		Human human = new Human();
		human.age = 20;
		test.t3(human); // 인자값 (argumant)
		
		System.out.println(human.age);
		
		int [] ar = new int[3];
		ar[0] = 3;
		ar[1] = 2;
		ar[2] = 6;
		test.t4(ar);
		
		
		
	}
	}
