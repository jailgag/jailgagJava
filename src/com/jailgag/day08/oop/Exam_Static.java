package com.jailgag.day08.oop;

import java.util.Random;

class StaticSample {
	public int num;
	public void normalMethod() {}
	
	public static int input;
	public static void staticMethod() {}
}

public class Exam_Static {
	public static void main(String[] args) {
		StaticSample sample = new StaticSample();
		sample.num = 11;                               // 이거쓸때 아래 코드 랜덤 쓸때랑
		sample.normalMethod();                         //  형식이 비슷함!!!!
		
		
		StaticSample.input =10;
		StaticSample.staticMethod();
		
		Random rand = new Random();
		rand.nextInt(10);
		
		int num = (int)Math.random()*10+1;
		
	}
}
