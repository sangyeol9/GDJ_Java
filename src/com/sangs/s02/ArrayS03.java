package com.sangs.s02;

public class ArrayS03 {
public static void main(String[] args) {
	
	
	
	int[] ar = {2,5,4,1,3};
	int num;
	for(int i = 0; i <ar.length;i++) {
		
		for(int j=i+1;j<ar.length;j++)
		{
			if(ar[i]>ar[j]) {
			num = ar[i];
			ar[i] = ar[j];
			ar[j] = num;
			}
		}
		System.out.println(ar[i]);
	
	}
}
}
