package com.sangs.s04.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.lang.Math;
public class StudySet {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		ArrayList<Integer> ar = new ArrayList<>();
		int c=0;
		for(int i=0;i<6;i++) {
			c=0;
			ar.add((int)(Math.random()*45+1));
			for(int j=0; j<i;j++) {
				if(ar.get(i)==ar.get(j))
				{
					ar.remove(i);
					i--;
					c =1;
				}
				
			}
		}
		System.out.println(ar);
		
		for(int i=0;i<6;i++) {
		
		hs.add((int)(Math.random()*45+1));
		}
		
		System.out.println(hs);
		
		
		String s = "j-3jfj-4gj-2jg-3";
		StringTokenizer ss = new StringTokenizer(s,"-");
		
		while(ss.hasMoreTokens())
			System.out.println(ss.nextToken());
		int coin=0;
		int [] arr = new int[6];
		for(int i=0;i<6;i++) {
			coin=0;
			arr[i] = (int)(Math.random()*45+1);
				for(int j=0;j<i;j++) {
					if(arr[i] == arr[j]) {
						i--;
						coin=1;
						
					}
				}
				if(coin==0)
					System.out.printf(arr[i]+ " ");
		}
		
		
	}
	
}
