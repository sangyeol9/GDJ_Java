package com.winter.study7.ex1.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import com.winter.study7.ex1.Client.*;


public class ServerController {

	ServerDAO dao = new ServerDAO();
	WeatherDTO dto = new WeatherDTO();
	List<WeatherDTO> ar= null;
	public void start() throws Exception {
		//클라이언트랑 연결 준비
		System.out.println("접속대기");
		ServerSocket ss = new ServerSocket(8282);
		Socket sc = ss.accept();
		System.out.println("클라와의 연결이 성공");
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		String s =null;
		while(true) {
		is =sc.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		String a = br.readLine();
		if(a.equals("3")) {
			System.out.println("종료");
			break;
		}
		
		s =  dao.getWeathers();
		
		os= sc.getOutputStream();
		ow=new  OutputStreamWriter(os);
		bw = new BufferedWriter(ow);
		
		if(a.equals("1")) {
			bw.write(s+"\n\r");
			bw.flush();
		}
		
		
		
		
		}
		
		br.close();
		ir.close();
		is.close();
		//1. 하나의 문자열로 만들어서 여러개의 날씨 정보를 보내준다
		
		
	}
}
