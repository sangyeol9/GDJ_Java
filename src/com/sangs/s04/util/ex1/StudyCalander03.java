package com.sangs.s04.util.ex1;

import java.util.Calendar;
import java.util.UUID;

public class StudyCalander03 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar.getTime());
		long  a = calendar.getTimeInMillis();
		a = a+(1000*60*60*24*15);
		calendar.setTimeInMillis(a);
		
		System.out.println(calendar.getTime());
		
		calendar.set(2023,11,31);
		
		calendar.set(0, 0);
		String n = UUID.randomUUID().toString();
		System.out.println(n);
	}
}
