package com.jailgag.day02.control.condition.exercise;

import java.util.Scanner;

public class Exercise_If1 {
	/*
	 * 문제1
	 * 점수와 학년을 정수로 입력받아 60점 이상이면 합격
	 * 60점 미만이면 불합격으로 출력한다.
	 * 단, 4학년의 경우 70점 이상이어야 합격을 출력하는 프로그램을 작성하여라
	 * 점수를 입력하세요(0~100) :89
	 * 학년을 입력하세요(1~4) : 4
	 * 합격입니다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요(0~100) : ");
		int score = sc.nextInt();
		System.out.print("학년을 입력하세요(1~4) : ");
		int grade = sc.nextInt(); 
		// 4학년 
		if(score >= 60) {
			if(grade == 4 && score >=70) {
				System.out.println("불합격입니다");   //출력시 70/4 입력 불합격 합격같이 출력
				return;                           //return; 입력후 출력시 불합격만 출력
			}
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
	}
}
