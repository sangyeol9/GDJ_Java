package com.sangs.s06.ex1;

import java.util.ArrayList;

public class WeatherView {

	
	public void view(ArrayList<WeatherDTO> ar) {
		for(int i=0;i<ar.size();i++) {
	System.out.println("지역 : " + ar.get(i).region);
	System.out.println("기온 : " + ar.get(i).gion);
	System.out.println("날씨 : " + ar.get(i).weather) ;
	System.out.println("습도 : " + ar.get(i).sp);
			
		}
	}
//	public void view(ArrayList<WeatherDTO> ar ,int i) {
//		System.out.println("지역 : " + ar[i].region);
//		System.out.println("기온 : " + ar[i].gion);
//		System.out.println("날씨 : " + ar[i].weather) ;
//		System.out.println("습도 : " + ar[i].sp);
//		
//		
//	}
}
