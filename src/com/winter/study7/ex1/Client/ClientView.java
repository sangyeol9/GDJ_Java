package com.winter.study7.ex1.Client;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.winter.study7.ex1.Client.*;
import com.winter.study7.ex1.server.WeatherDTO;
public class ClientView {

	
	
	WeatherDTO wdth = new WeatherDTO();
	public void view(List<WeatherDTO> s) {
		
	for(WeatherDTO weatherDTO:s) {
		System.out.print(weatherDTO.getCity()+"-");
		System.out.print(weatherDTO.getGion()+"-");
		System.out.print(weatherDTO.getNal()+"-");
		System.out.println(weatherDTO.getSp());
	}
		
		
		
		
	}
	
	
}
