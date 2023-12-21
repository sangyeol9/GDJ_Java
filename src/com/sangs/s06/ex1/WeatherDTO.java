package com.sangs.s06.ex1;

import java.util.ArrayList;

public class WeatherDTO {
	String region;
	int gion;
	String weather;
	int sp;
	
	public ArrayList<WeatherDTO> weather(ArrayList<String> ar) {
		WeatherDTO [] we = new WeatherDTO[ar.size()/4];
		ArrayList<WeatherDTO> arr = new ArrayList<>();
		for(int i=0;i<we.length;i++) {
			we[i] = new WeatherDTO();
			we[i].region = ar.get(i*4+0);
			we[i].gion = Integer.valueOf(ar.get(i*4+1)) ;
			we[i].weather = ar.get(i*4+2);
			we[i].sp = Integer.valueOf(ar.get(i*4+3)) ;
		}
		for(int i=0;i<we.length;i++) {
			arr.add(we[i]);
		}
		return arr;
	}
	
}
