package com.sangs.s04.lang.ex2;

public class Month {

	public void month(String[] a) {
		String b = a[2] +a[3];
		
		if(b.equals("12") ||b.equals("1") || b.equals("2") ) {
			System.out.println("겨울에 태어난");
		}
		else if(b.equals("3")||b.equals("4")||b.equals("5")) {
			System.out.println("봄에 태어난");
		}
		else if(b.equals("6")||b.equals("7")||b.equals("8")) {
			System.out.println("여름에 태어난");
			
		}
		else
			System.out.println("가을에 태어난");
	}
	
}
