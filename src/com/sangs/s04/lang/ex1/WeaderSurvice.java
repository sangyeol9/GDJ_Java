package com.sangs.s04.lang.ex1;

public class WeaderSurvice {
	private String datas;

	Weather we = new Weather();
	
	public WeaderSurvice() {
		this.datas = "서울-10-비-80-부산-25-맑음-50,대구-82-눈-12,제주.25,태풍.75";
	}
	
	public String[] init() {
		this.datas = this.datas.replace(',', '-');
		this.datas = this.datas.replace('.','-');
		
		String[] a = this.datas.split("-");
		
		return a;
	}
	
	public void weatheroutput (String [] a) {
		
		
		Weather [] c = new Weather[a.length/4];
		System.out.println("오늘의 날씨~ ");
		
		for(int i=0; i<c.length;i++) {
		c[i] = new Weather();
		c[i].setA(a[i*4]);
		c[i].setB(Integer.valueOf( a[i*4+1] ));
		c[i].setC(a[i*4+2] );
		c[i].setD(Integer.valueOf( a[i*4+3] ));
			
		System.out.println(c[i].getA() + " " + c[i].getB() + "도 날씨=" + c[i].getC() + " 습도=" + c[i].getD());
		//1 날씨 추가 , 2 수정 , 3,삭제 , 4목록 , 5 검색
		}

	}
	
	
}
