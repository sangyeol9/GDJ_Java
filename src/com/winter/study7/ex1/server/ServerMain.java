package com.winter.study7.ex1.server;
import com.winter.study7.ex1.Client.*;
public class ServerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServerController sc = new ServerController();
		try {
			sc.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
