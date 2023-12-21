package com.winter.study7.ex1.Client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;

import com.winter.study7.ex1.server.*;

public class ClientController {

	
	public void start() throws Exception {
		//1.서버와 소켓 연결 시도
		Scanner sc1 = new Scanner(System.in);
		Socket sc = new Socket("LocalHost",8282);
		ClientView view = new ClientView();
		System.out.println("서버와의 연결에 성공했따.");
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		
		while(true) {
			ArrayList<WeatherDTO> ar = new ArrayList<>();
		System.out.println("1.출력  2.검색 3.종료");
		String a = sc1.nextLine();
		os=sc.getOutputStream();
		ow = new OutputStreamWriter(os);
		bw= new BufferedWriter(ow);
		
		bw.write(a+"\n\r");
		// \r = 
		bw.flush();
		if(a.equals("3")) {
			System.out.println("종료");
			break;
		
		}
		
		is = sc.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		
		String s = br.readLine();
		
		
		StringTokenizer st = new StringTokenizer(s,"-");
		
		while(true) {
		if(!st.hasMoreTokens()) break;
		WeatherDTO dto = new WeatherDTO();
		dto.setCity(st.nextToken());
		dto.setGion(Integer.parseInt(st.nextToken()));
		dto.setNal(st.nextToken());
		dto.setSp(Integer.parseInt(st.nextToken()));
		ar.add(dto);
		}
		
		if(a.equals("1")) view.view(ar);
		
		else if(a.equals("3")) break;
		
		}
		
		
		bw.close();
		ow.close();
		os.close();
		sc1.close();
		
		
		/* 1. 날씨정보출력
		 * 2. 날씨정보검색
		 * 3. 프로그램종료
		 * 
		 * 1. 하나의 문자열로 받은 날씨정보를 잘라서 구분한다
		 * 
		 */
		
		
	}
	
}
