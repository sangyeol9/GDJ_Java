package com.winter.study7.ex1.Client;
import com.winter.study7.ex1.Client.*;
public class ClientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClientController cc = new ClientController();
		try {
			cc.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
