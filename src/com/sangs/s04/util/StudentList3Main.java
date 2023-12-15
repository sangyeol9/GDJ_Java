package com.sangs.s04.util;

import java.util.ArrayList;

public class StudentList3Main {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(1);
		StudeyList3 st3= new StudeyList3();
		st3.add(ar);
		for(Integer i:ar) {
			System.out.println(i);
		}
	}
}
