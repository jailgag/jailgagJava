package com.jailgag.day08.method;

public class Exam_Method {
	/*
	 * 리턴형 o,x
	 * 매개변수 o,x
	 * 
	 * 리턴형 x 매개변수 x
	 * 리턴형 x 매개변수 o
	 * 리턴형 o 매개변수 x
	 * 리턴형 o 매개변수 o
	 * 
	 */
	public void noReturnNoParam() {
		System.out.print("noReturnNoPram");
		return;
	}
	public void noReturnYesParam(int num) {
		System.out.print("num : " + num);
		return;
	}
	public int yesReturnNoParam() {     //<----이부분 void를 수정안함....int로 바꿈 오류해결!!
		int date = 20241118;
		return date;   
	}
	
	public int yesReturnYesParam(int num) {
		num += 10;
		return num;
	}
	// 리턴형 o , 매개변수 o
	public int sum(int ...numbers) {
		int sum = 0;
		for(int num: numbers) {
			sum += num;
		}
		return sum;
	}
	
}
