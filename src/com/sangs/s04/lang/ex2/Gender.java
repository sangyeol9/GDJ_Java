package com.sangs.s04.lang.ex2;

public class Gender {

		public String[] gender(String a) {
			
			String [] num = new String[14];
			num = a.split("");
		
			
			if(num[7].equals("1") || num[7].equals("3")){
				System.out.println("남자입니다.");
			}
			else if(num[7].equals("2") || num[7].equals("4")) {
				System.out.println("여자입니다");
			}
			return num;
		}
	
}
