package com.sangs.s04.util;

import java.util.ArrayList;

public class StudyList2 {
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		
		ar.add(1);
		ar.add("second");
		ar.add(false);
		ar.add(4.23);
		
		// 타입의 안정성 문제        = 몇번방에 뭐가 들어있는지 모른다.
		int n = (Integer)ar.get(0);
		String str = (String)ar.get(1);
		boolean c = (Boolean)ar.get(2);
	}
}
