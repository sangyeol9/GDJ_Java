package com.sangs.s06.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class WeatherDAO {
	//DAO = Data Access Object 데이터접근
	//DTO = 데이터를 담는
	//getWeathers
	//file에서 내용 읽기
	
	public ArrayList<String> getWeathers() throws Exception {
		File file = new File("c:\\study\\weather.txt");
		String a = "";
		String che = "";
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		int coin=0;
		while(true) {
			che = br.readLine();
		if(che==null) break;
		else if(!che.equals("") && coin !=0)
		a +=che + "\n";
		coin++;
		}
	
		
		br.close();
		fr.close();
		String [] b = null;
		b = a.split("[-\n]");
		ArrayList<String> ar = new ArrayList<>();
		for(int i=0; i<b.length;i++) {
			
			ar.add(b[i]);
		}
	
		br.close();
		fr.close();
		return ar;
		
		
	}
	
	public void save(List<WeatherDTO> ar) {
		
	}
	
	
}
