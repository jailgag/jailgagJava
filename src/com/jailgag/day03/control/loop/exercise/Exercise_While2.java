package com.jailgag.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_While2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);\
		int i = 0;
		int sum =0;
		while(i < 10) {
			//실행문장;
			System.out.print("값 : ");
		int num = sc.nextInt();\
		sum += num;
		i++;	
		}
		System.out.println();
//		System.out.print("값 :");
//		int num = sc.nextInt();
//		System.out.print("값 :");    //내생각 식과 달라 오류 남(캡쳐참고해서 이유알기)
//		num = sc.nextInt();          //
//		System.out.print("값 :");
//		num = sc.nextInt();
//		System.out.print("합 : 3");
	}
}
