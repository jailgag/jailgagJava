package com.jailgag.day05.recap;

import java.util.Scanner;

public class StudentAppArray2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] scores = new int[3];
//		scores[0] = 0;      // 다시 보고 출력해보기 순서 있었음!!!!
//		scores[1] = 0;
		
//		scores[2] = 0;
		finish:
		while(true) {
			System.out.println("====== 메인 메뉴 ======");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.println("선택 >> 1");
			//int choice;
			int choice = sc.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("===== 성적 입력 ====="); 
				System.out.println("국어");
				scores[0] = sc.nextInt();
				System.out.println("영어");
				scores[1] = sc.nextInt();
				System.out.println("수학");
				scores[2] = sc.nextInt();
				break;
			case 2: 
				System.out.println("==== 성적 출력====");
				System.out.println("국어" + scores[0]);
				System.out.println("영어" + scores[1]);
				System.out.println("수학" + scores[2]);
				System.out.println("총점" + (scores[0]+scores[1]+scores[2]));
				System.out.println("평균" + (scores[0]+scores[1]+scores[2])/(double)scores.length);
				break;
			case 3:
				System.out.println("프로그램이 종료되었습니다.");
				break finish;
			default :
				System.out.println("1~3사이의 수를 입력해주세요.");
				break;
			}
			
		}
		
	}
	
}
