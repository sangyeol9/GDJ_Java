package com.sang.members;

public class Members {

	private String name;
	private double muge;
	private double ki;
	private int age;
	
	public Members() {
		
	}
	

	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setMuge(double muge) {
		if(muge>=4&&muge<=250)
		this.muge = muge;
		else System.out.println("무게를 다시 입력해주세요");
	}
	public double getMuge() {
		return this.muge;
	}



	public double getKi() {
		return ki;
	}



	public void setKi(double ki) {
		this.ki = ki;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
