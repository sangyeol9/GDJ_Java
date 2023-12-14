package com.sang.s03.ex;

public class Delete extends Ex {

	
	public Ex[] bbb(Ex[] a,int b) {
		
		int d = a.length;
		Ex[] c = new Ex[d-1];
//		
//		for(int i=0; i<c.length;i++) {
//			if(i<b) {
//				c[i] = a[i];
//			}
//			else {
//				c[i] = a[i+1];
//			}
//		}
		int count =0;
		for(int i=0;i<c.length;i++) {
			
			if(a[i].getNum()==b) {
				count += 1;
				c[i] = a[count]; 
				count++;
			}
			else {
				c[i] = a[count];
				count++;
			}
		}
		
		return c;
	}
}
