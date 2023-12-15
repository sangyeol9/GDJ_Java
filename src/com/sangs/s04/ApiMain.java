package com.sangs.s04;

public class ApiMain {

	public static void main(String[] args) {
		Test t = new Test();
		Object obj = new Object();
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		boolean ch =obj.equals(obj);
		String st = obj.toString();
		System.out.println(ch);
		System.out.println(st);
		
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("abc");
		buffer.append(213);
		System.out.println(buffer);
		
		//문자열로 변환
		String str = buffer.toString();
		System.out.println(str);
	}
	
}
