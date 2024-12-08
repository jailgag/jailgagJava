package com.jailgag.day03.control.loop.exercise;

public class Exercise_ForDouble1 {
	public static void main(String[] args) {
		/*
		 * 0시 0분부터 23시 59분까지 출력하는 프로그램을 작성하세요
		 * 0시 0분
		 * 0시1분
		 * 0시2분
		 * 0시3분
		 * ......
		 * 0시 59분
		 * 1시0분
		 * 1시1분
		 * 1시2분
		 * .....
		 * 1시59분
		 * 2시0분
		 * 2시1분
		 * 2시2분
		 * .....
		 * 22시 58분
		 * 22시 59분
		 * 23시 0분
		 * ...
		 * 23시
		 */
		for(int i = 0; i < 24; i++) {
			for(int j=0; j < 60; j++) {
				System.out.println(i+ "시" + j + "분");
			}
		}
//		for(int hour = 0; hour < 24; hour++) {
//			for(int min =0; min < 60; min++)
//				System.out.println(hour+ "시"+ min + "분");
//		}
//		
	}
}
