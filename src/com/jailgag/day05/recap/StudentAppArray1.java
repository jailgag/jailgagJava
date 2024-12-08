package com.jailgag.day05.recap;

import java.util.Scanner;

public class StudentAppArray1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, math;
		kor =0;
		eng =0;
		math = 0;
		finish:
		while(true) {
			System.out.println("====== 메인메뉴 =====");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.print("선택 >>");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("===== 성적 입력 =====");
				System.out.println("국어 :" );
				kor = sc.nextInt();
				System.out.println("영어 :" );
				eng = sc.nextInt();
				System.out.println("수학 :" );
				math = sc.nextInt();
				break;
			case 2:
				System.out.println("===== 성적 출력 =====");
				System.out.println("국어 :" + kor);
				System.out.println("영어 :" + eng);
				System.out.println("수학 :" + math);
				System.out.println("총점 :" + (kor+eng+math));
				System.out.println("평균 :" + (kor+eng+math)/3.0);
				break;
			case 3:
				System.out.println("프로그램이 종료되었습니다.");
				break finish; //프로그램 종료
			default :
				System.out.println("1~3 사이의 수를 입력해주세요");
				break;
			}
		}
	}
}
