package com.jailgag.day13.oop;

public class Student {
	//필드
	private String name = "";        //<--private추가
	private int kor;   //<---여기부터 작성돌입!!!!int로바꿈
	private int eng;   //0값지워줌!!
	private int math;
	
	//매소드 생성자
	public Student() {}
	public Student(String name,
			int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	//메소드
	//getter /setter
	public String getName() { // 어디서String//name의 get!!    get,set개셋암기!!
		return name;
	}
	public void setName(String name) { //name의 set
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {   //void고치는거!!!다시기억!!
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {   //int를 void로 수정!!!
		this.eng = eng;
	}
	public int getMath() {
		return math;    //math 추가!!!!
	}
	public void setMath(int math) {  //여기도 수정!!!
		this.math = math;
	}
	
	
	public int total() {
		return kor+eng+math;
	}
	public double avg() {
		return this.total()/3.0;
	}
}
