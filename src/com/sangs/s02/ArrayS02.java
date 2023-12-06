package com.sangs.s02;

public class ArrayS02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar = {2,4,3};
		int [] ar2 = new int[2];
	
		ar2[0] = ar[0];
		ar2[1] = ar[1];
		ar=ar2;
		
		for(int i=0; i <ar.length;i++) {
			
			System.out.println(ar[i]);
			
		}
	
	}

}
