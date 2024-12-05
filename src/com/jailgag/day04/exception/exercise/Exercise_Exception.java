package com.jailgag.day04.exception.exercise;

import java.util.Scanner;

public class Exercise_Exception {
	public static void main(String[] args) {
		/*
		 * 두개의 정수를 입력받아 나눈후
		 * 그 결과를 출력하는 프로그램을 작성하여라
		 */
		Scanner sc = new Scanner(System.in);
		/*
		 * while(true)
		 * for (;;)
		 * 
		 */
		while(true) {
			int result =0;
			try {
				System.out.print("첫번째 정수 입력: ");
				int num1 = sc.nextInt();
				System.out.print("두번째 정수 입력 :");
				int num2 = sc.nextInt();
				result = num1 / num2;
			} catch (ArithmeticException e) {
				// e.printStackTrace()
				System.out.println("0으로 나눌수 없습니다");
				continue;
		}
			System.out.println("결과 :" + result);
			
		
		}
	}
}
