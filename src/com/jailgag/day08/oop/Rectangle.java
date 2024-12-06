package com.jailgag.day08.oop;

import java.util.Scanner;

public class Rectangle {
	/*
	 * 너비와 높이를 입력받아 사각형의 합을 출력하는 프로그램을 작성하라,
	 * 너비(width)와 높이(heigth) 필드, 그리고 면적값을 제공하는 getArea() 메소드를 가진
	 * Rectangle 클래스를 만들어 활용하라,
	 * 
	 * >>4 5
	 * 사각형의 면적은 20
	 */
	int width;
	int heigth;
	
	public int getArea() {
		return width*heigth;
	}
	
	
	public static void main(String[] args) {    //코드 작성해보기!! 예제
		
		
		
		Rectangle rect = new Rectangle();       // Circle 보고 참고할것! 
		Scanner sc = new Scanner(System.in);
		System.out.print(">> ");
		rect.width = sc.nextInt();
		rect.heigth =sc.nextInt();
		
		System.out.println("사각형의 면적은 " + rect.getArea());
		
	}
	
	
	
	
}
