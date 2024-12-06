package com.jailgag.day08.method;

public class Run_Method {
	
	public static void main(String[] args) {
	Exam_Method	em = new Exam_Method();
	//리턴형 x        , 매개변수 x
	em.noReturnNoParam(); //<---- 에러수정!!
	//리턴형 x        , 매개변수 0
	em.noReturnYesParam(20250502);
	// 리턴형 o        ,매개변수 x
	System.out.println(em.yesReturnNoParam());
		//수정할것!!!!
	// 리턴형 o          매개변수 o
	int result = em.yesReturnYesParam(1000);
	System.out.println(result);
	
	result = em.sum(1,2,3,4,5);
	System.out.println("result :" + result);
		
	}
}
