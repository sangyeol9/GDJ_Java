package com.sangs.s04.util;

import java.util.ArrayList;

public class StudyList {
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		//배열과 비슷
		//선언시 따로 갯수를 선언하지않는다.
		//추가 add  = List 끝부분에
		ar.add("First"); // 부모타입으로 형태를 바꾼 다형성
		ar.add("second");
		ar.add(3);
		
		ar.add(1, 4);
		ar.set(0, "1");
		ar.remove(1);
		ar.remove("second");
		ar.clear();
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
	}
}
