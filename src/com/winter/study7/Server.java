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
import java.util.Scanner;

public class Server {

	
	public void s() throws Exception {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("접속대기");
		ServerSocket ss = new ServerSocket(8282);
		
		Socket sc = ss.accept();
		System.out.println("성공");
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter sw = null;
		BufferedWriter bw = null;
		while(true) {
			is = sc.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			System.out.println(br.readLine());
			
			if(br.readLine().equals("exit"))
				break;
		
		
		//Socket socket = new Socket("192.168.7.182", 8282);
		System.out.println("이젠 내가 클라이언트");
		System.out.println("메시지 입력");
		String s = sc1.nextLine();
		os=sc.getOutputStream();
		
		sw=new OutputStreamWriter(os);
		
		bw = new BufferedWriter(sw);
		
		bw.write(s+"\n\r");
		bw.flush();
		if(s.equals("exit"))
			break;
		
		}
		bw.close();
		sw.close();
		os.close();
		sc1.close();
	//	socket.close();
		
		br.close();
		ir.close();
		is.close();
		sc.close();
		
		
		
		System.out.println("종료");
		

		
		
	
		
		
		
		
	}
}
