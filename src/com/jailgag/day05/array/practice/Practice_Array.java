package com.jailgag.day05.array.practice;

import java.util.Random;
import java.util.Scanner;

public class Practice_Array {
	public void practice1() {
		/*
		 * 길이가 10인 배열 선언
		 * 1부터 10까지의 값
		 * 반복문을 이용하여 순서대로 배열에 저장
		 */
		int [] arrs;
		arrs = new int[10];
		for(int i = 0; i < 10; i++) {
			arrs[i] = (i+1);
		}
		for(int i= 0; i < 10; i++) {
			System.out.print(arrs[i]+ " ");
		}
	}
	public void practice2() {
		/*
		 * 길이가 10인 배열 선언
		 * 10부터 1까지의 값
		 * 반복문을 이용하여 순서대로 배열에 저장
		 */
		int [] arrs = new int[10];
		for(int i = 0; count=10; i < 10; i++,count--)  //쓰니 거꾸로!!!
			arrs[i] = count;
		for(int i = 0; i < 10; i++)            //집에껀 에러안남...?
			System.out.print(arrs[i]+ " ");
		
		// 에러 ??? 다시 써볼것 !!!
	}
	public void practice3() {
		/*
		 * 길이가 5인 String배열 선언
		 * "사과", "귤", "포도", "복숭아", "참외" 순서대로 저장
		 * 그리고 배열 인덱스를 이용해서 귤 출력
		 */
		String fruits [];
		fruits = new String[5];
		fruits[0] = "사과";
		fruits[1] = "귤";
		fruits[2] = "포도";
		fruits[3] = "복숭아";
		fruits[4] = "참외";
		System.out.println(fruits[1]); //귤
		for(int i =0; i < fruits.length; i++)
			System.out.println(fruits[i]+ " ");
	}
	public void practice4() {
		/*
		 * 사용자에게 입력받은 양의 정수만큼 배열 크기를 할당하고
		 * 1부터 입력받은 값까지 배열에 초기화한 후 출력하세요
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		int [] nums = new int[input];
		// 배열에 데이터 저장 (1~ input 까지)
		//??
		for(int i =0; i < input; i++) {
			nums[i] = (i+1);
			System.out.println(nums[i] + " ");
		}
		
	}
	public void practice5() {
		/*
		 * 문자열 : application
		 * 문자 : i
		 * application에 i가 존재하는 위치(인덱스) 4 8
		 * i 개수 : 2
		 */
		
	}
	public void practice6() {
		System.out.println("practice6");
	}
	public void practice7() {
		/*
		 * 사용자가 배열이 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		 * 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화
		 * 
		 * 사용자가 배열의 길이를 직접 입력
		 * 그 값만큼 정수형 배열을 선언, 생성 및 초기화
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int input = sc.nextInt();
		int [] nums = new int[input];
		int sum = 0;
		//배열의 크기만큼 사용자가 직접 값을 입력, 각각의 인덱스에 값을 초기화
		for(int i= 0; i < nums.length; i++) {
			System.out.print("배열 "+i+ "번째 인덱스에 넣을 값 : ");
			input = sc.nextInt();
			nums[i] = input;
			//누적합 나타날때 밑에 코드 사용??
			sum += nums[i];
		}
		// 전체 값을 나열하고....
		for(int num:nums)
			System.out.print(num + " ");
		
		System.out.println();
		System.out.println("총 합 : " +sum);
	}
	public void practice8() {
		System.out.println("practice8");
	}
	public void practice9() {
		System.out.println("practice9");
	}
	public void practice10() {
		System.out.println("practice10");
	}
	public void practice11() {
		/*
		 * 로또 번호 자동 생성기 프로그램을 작성하시오
		 * 단, 중복값 없이 오름차순으로 정렬하여 출력하세요
		 * 순서 기억해서 다시 코딩!!!
		 */
		
		int [] lottos = new int[6];
		Random rand = new Random();
		for(int i =0; i < lottos.length; i++) {  //i값은 고정값!!
			//1~ 45 사이의 숫자가 랜덤하게 나와야함.
//			System.out.print((rand.nextInt(45)+1)+ " ");
			// 배열안에 넣어보기
			lottos[i] = rand.nextInt(45)+1;
			
			for(int j=0; j < i; j++) {
				if(lottos[i] == lottos[j]) {
					i--;  // 비교를 하다가 비교를 안하게 되는경우가있음
				}         // break를 쓴다??
				
			}

//			//#1
//			if(lottos[1] == lottos[0]) {
//				i--;
//			}
//			//#2
//			if(lottos[2] == lottos[1]) {    // 반복문 바꾸기;
//				i--;
//			}
//			if(lottos[2] == lottos[0]) {
//				i--;
//			}
//			
//			//#3
//			if(lottos[3] == lottos[2]) {
//				i--;
//			}
//			if(lottos[3] == lottos[1]) {
//				i--;
//			}
//			if(lottos[3] == lottos[0]) {
//				i--;
//			}
//			//#4
//			if(lottos[4] == lottos[3]) {
//				i--;
//			}
//			if(lottos[4] == lottos[2]) {
//				i--;
//			}
//			if(lottos[4] == lottos[1]) {
//				i--;
//			}
//			if(lottos[4] == lottos[0]) {
//				i--;
//			}
//			//#5
//			if(lottos[5] == lottos[4]) {
//				i--;
//			}
//			if(lottos[5] == lottos[3]) {
//				i--;
//			}
//			if(lottos[5] == lottos[2]) {
//				i--;
//			}
//			if(lottos[5] == lottos[1]) {
//				i--;
//			}
//			if(lottos[5] == lottos[0]) {
//				i--;
//			}
//			
			
		}
		System.out.println();   // 개행!!
		// 선택,삽입,버블, 퀵 , 머지 등등 있음....!!!
		for(int j =0; j < (lottos.length-1); j++) {
			for(int i =0; i < (lottos.length-1)-j; i++) {
				if(lottos[i] > lottos[i+1]) {
					int temp = lottos[i];
					lottos[i] = lottos[i+1];     //출력값 다시확인!!!
					lottos[i+1] = temp;          //어딘가 오류작성,,,
				}
			}    //중복값 없애주는거 내용 복습!!!
		}
		for(int lotto: lottos) {
			System.out.print(lotto + " ");  //에러 lottos로 입력함....
		}
		System.out.println();
	}
}
