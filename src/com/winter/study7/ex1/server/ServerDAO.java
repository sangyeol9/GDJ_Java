package com.winter.study7.ex1.server;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.winter.study7.ex1.Client.*;
public class ServerDAO {

	WeatherDTO dto = new WeatherDTO();
	
	public String getWeathers() throws Exception {
		File file = new File("c:\\study\\weather.txt");
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		br.readLine();
		ArrayList<WeatherDTO> wdao = new ArrayList<>();
		String s = "";
		while(true) {
			String ss = br.readLine();
			if(ss == null) break;
		StringTokenizer st = new StringTokenizer(ss,"\n");
		
		s +=st.nextToken();
		
		s+="-";
//		s +=st.nextToken();
//		s +=st.nextToken();
//		s +=st.nextToken();
//		dto.setCity(st.nextToken());
//		dto.setGion(Integer.parseInt(st.nextToken()));
//		dto.setNal(st.nextToken());
//		dto.setSp(Integer.parseInt(st.nextToken()));
//		wdao.add(dto);
		
		}
		s = s.substring(0,s.lastIndexOf("-"));
		return s;
		
	}
	
}
