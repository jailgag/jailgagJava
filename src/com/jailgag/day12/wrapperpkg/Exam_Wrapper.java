package com.jailgag.day12.wrapperpkg;

public class Exam_Wrapper {
	public static void main(String[] args) {
		int num = 10;   //기본형은 int num으로 씀!!
		num = 1118;
		Integer su = null; 
		//The constructor Integer(int) has been deprecated since version 9 and marked for removal  <--에러값 밑에 쓸수 없다?? 
		//su = new Integer(10);    //위에 에러코드복붙해서 첨가해보기!!
		su = Integer.valueOf(502);
		if(su != null) {
			su = 1225;   //오토박싱 (auto_boxing)
		}
		num = su.intValue(); //원칙 int <= Integer
		num = su;  //오토 - 언박싱 (auto-unboxing)
		Double du = Double.valueOf(11.18);
		du = 5.02;
		double dNum = du.doubleValue();
		dNum = du;
		// Wrapper 클래스를 쓰는이유
		//1. null체크가 가능해짐, int -> 0.0, String --> null --> 모두다 널로 체크가능
		//2. 형변환 가능, String --> int, String --> boolean
		String openDate = "20241118";
		System.out.println(openDate +1);   //   <---복붙하고바꿔줌!!! Date는 +1을 해줘야함?
		int openDateNum = Integer.parseInt(openDate);  //<---- 무슨 기능인지복습할때 체크해볼것!!
		System.out.println(openDateNum +1);   //<--- 출력문 20241119뜸!!!!
		
		System.out.println(Character.toLowerCase('A'));  //. 누르고 창뜨면toLowcase클릭!!!  <---이거역할 대문자를 소문자로 바꿔줌!!
		System.out.println(Character.toUpperCase('b'));  //  위에꺼랑 같음!! toUpperCase역할은 반대로 소문자를 대문자로 바꿔줌!!!
		char c1 = '5', c2 ='F';
		if(Character.isDigit(c1))
			System.out.println("숫자입니다");
		if(Character.isAlphabetic(c2))
			System.out.println("영문자입니다");    //<---영문자 출력???
		//======================문자열로 바꾸기 ====================
		/*
		 * 1.String.valueOf(1);
		 * 2. +""붙이기     "  쌍따옴표!!! 
		 * 3. .toString()
		 */
		System.out.println(1);  //숫자를 문자열로 취급할려고한다면~~
		System.out.println(String.valueOf(1) instanceof String);
		System.out.println(1+"" instanceof String);     //2개다 출력값 True 나옴!!   <--영상보고 방법써보기!!
		System.out.println(Integer.valueOf(1).toString() instanceof String);  //<---이것도 true나옴!!!
		
	}
}
