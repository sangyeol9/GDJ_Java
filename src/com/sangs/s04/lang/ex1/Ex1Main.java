package com.sangs.s04.lang.ex1;

public class Ex1Main {

		public static void main(String[] args) {
			WeaderSurvice wea = new WeaderSurvice();
			Weather we = new Weather();
			String[] w;
			w=wea.init();
			wea.weatheroutput(w);
			
		}
	
}
