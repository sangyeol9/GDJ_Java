package com.winter.study7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public void send() throws Exception {
		Scanner sc1 = new Scanner(System.in);
		Socket socket = new Socket("LocalHost", 8282);
		System.out.println("서버와 접속이 성공했다.");
		//ServerSocket ss = new ServerSocket(8282);
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		while(true) {
		System.out.println("서버로 보낼 메세지 입력");
		String m = sc1.nextLine();
		
		os=socket.getOutputStream();
		ow=new OutputStreamWriter(os);
		bw = new BufferedWriter(ow);
		
		
		bw.write(m+"\n\r");
		bw.flush();
		if(m.toLowerCase().equals("exit"))
			break;
		
		//Socket sc = ss.accept();
		System.out.println("성공");
		is = socket.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		System.out.println(br.readLine());
		if(br.readLine().equals("exit"))
			break;
		}
		br.close();
		ir.close();
		is.close();
		//sc.close();
		//ss.close();
		
		
		System.out.println("접속 끝");
		bw.close();
		ow.close();
		os.close();
		sc1.close();
		socket.close();
		
	}
	
	
}
