package com.sangs.s04.lang.ex2;

public class Check {
	int [] check = {2,3,4,5,6,7,8,9,2,3,4,5};
	
	public void check(String[] a) {
		
		int result =0;
		int count =0;
		for(int i=0;i<a.length-1;i++) {
			if(i==6) {}
			else {
			result += Integer.valueOf(a[i]) * check[count];
			count++;
			}
			
		}
		
		
		result = result %11;
		result = 11 -result ;
		if(result == 10 || result ==11 ) result = result%10;
		
		if(result==Integer.valueOf(a[13]))
		System.out.println("올바른 주민번호입니다");
		else System.out.println("잘못된 주민번호입니다");
		
	}
	
}
