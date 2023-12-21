package com.sangs.s04.util.ex1;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class StudySimpleFormat {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		String str =sd.format(calendar.getTime());
		System.out.println(str);
		
		String d = "2020-12-24";
		sd.applyPattern("yyyy-MM-dd");
		
		
		//Date date = sd.parse(d);
		//System.out.println(date);
		
	}
}
