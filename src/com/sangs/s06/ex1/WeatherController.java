package com.sangs.s06.ex1;

public class WeatherController {

	private WeatherDAO weatherDAO;
	private WeatherView view;
	
	public WeatherController() {
		this.view = new WeatherView();
		this.weatherDAO = new WeatherDAO();
	}
	
}
