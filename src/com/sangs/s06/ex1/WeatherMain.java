package com.sangs.s06.ex1;

import java.util.ArrayList;

public class WeatherMain {
	public static void main(String[] args) {
		WeatherDAO dao = new WeatherDAO();
		WeatherDTO dto = new WeatherDTO();
		ArrayList<WeatherDTO> dtoar ;
		WeatherView view = new WeatherView();
		ArrayList<String> ar = new ArrayList<>();
		try {
			ar = dao.getWeathers();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dtoar=dto.weather(ar);
		view.view(dtoar);
		
	}
}
