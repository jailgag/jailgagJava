package com.jailgag.day01.inputsc;

import java.io.IOException;
import java.util.Scanner;

public class Exam_ScannerTest {
	public static void main(String[] args) throws IOException {
		System.out.println("반지름 입력: ");
		//int input = System.in.read();
		//System.out.println("출력: " + (input-48));
		Scanner sc = new Scanner(System.in);   // 무조건 입력
		//int input = sc.nextInt();            // 정수입렵 nextInt
		double radius = sc.nextDouble();
		String msg = sc.next();
		//실수입력 nextDouble
		//System.out.println("입력받은 값 :" + input);
		final double PI = 3.14;
		
		double cicleArea = radius * radius * PI;
		System.out.println("원의 면적 : " + cicleArea);
	}
}
