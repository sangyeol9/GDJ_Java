package com.sangs.s04.util.ex1;

import java.util.ArrayList;

public class StudentService {

	
	
	
	private String info;
	
	public StudentService() {
		this.info = "winter-1-50-60-80";
		this.info += "-iu-2-85-94-74";
		this.info += "-karina-3-78-78-98";
	}
	
	private String [] infos = null;
	public ArrayList<Student> init() {
		infos = this.info.split("-");
	
		ArrayList<Student> ar = new ArrayList<>();
		
		for(int i=0;i<infos.length/5;i++) {
			Student student = new Student();
			student.setName(infos[i*5+0]);
			student.setNum(Integer.valueOf(infos[i*5+1]));
			student.setGuk(Integer.valueOf(infos[i*5+2]));
			student.setMath(Integer.valueOf(infos[i*5+3]));
			student.setEng(Integer.valueOf(infos[i*5+4]));
			student.setSum(student.getEng()+student.getGuk()+student.getMath());
			student.setAb((double)student.getSum()/3);
			ar.add(student);
			
		//	System.out.println(ar.get(i).getName() + " : " + ar.get(i).getAb());

		}
	return ar;
	}
	
	//학생정보검색 이름
	public void findByName() {
		
	}
	
	//학생정보추가
	public void studentAdd() {
		
	}
	
	//학생정보삭제 이름
	public void studentDelete() {
		
	}
}
