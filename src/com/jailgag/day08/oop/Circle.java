package com.jailgag.day08.oop;

public class Circle {
	final double PI = 3.14;
	double radius;
	
	public double getArea() {
		return PI*radius*radius;                
	}
	public static void main(String[] args) {
	Circle pizza = new Circle();
	pizza.radius =10;								//radius=10; 적고 pizza. 적고 출력 314.0
	System.out.println(pizza.getArea());      //1. pizza.getArea 쓰고 소괄호 감싸고 Sysout 씀 출력0.0
	
	Circle donut = new Circle();
	donut.radius =2;
	System.out.println(donut.getArea());         // 위방법으로 동일 출력하면 12.56 
	
	}
}
