package com.jailgag.day06.array.sort;

public class Exam_bubleSort {
	public static void main(String[] args) {
		int [] arrs = {2, 5, 4, 1, 3};
		
		
		// 0의 자리에는 i
		// 1의 자리에는 i+1
		// i가 0부터 3까지 증가    (바꾸는 방법) 
//      
		for(int j = 0; j < arrs.length-1;  j++) {     //  <----이부분추가 괄호 체크~~!!!
			for(int i=0; i < (arrs.length-1)-j; i++) {       //for문바꿀때괄호 신경쓰기!!체크
				if(arrs[i] > arrs[i+1]) {
					int temp = arrs[i+1];
					arrs[i+1] = arrs[i];         //  바뀐건 아래 코드 보면 바꾼거
					arrs[i] = temp;              //볼수 있음
				}
			}
		}
		//1. 바꾸면 간단하게 코드.. 출력 1 2 3 4 5 
		for(int j = 4; j > 0; j--) {     //  <----이부분추가 괄호 체크~~!!!
			for(int i=0; i < 4; i++) {       //for문바꿀때괄호 신경쓰기!!체크
			if(arrs[i] > arrs[i+1]) {
				int temp = arrs[i+1];
				arrs[i+1] = arrs[i];
				arrs[i] = temp;
				}
			}
		}
		
		
		
//		# 출력값 2 4 1 3 5 
//		for(int i=0; i < 4; i++) {    //for문바꿀때괄호 신경쓰기!!체크
//		if(arrs[i] > arrs[i+1]) {
//			int temp = arrs[i+1];
//			arrs[i+1] = arrs[i];
//			arrs[i] = temp;
//			}
//		}
////		#2 출력값 2 1 3 4 5   --> for문에 int 중간 4-->3으로 바꿈
//		for(int i=0; i < 3; i++) {    //for문바꿀때괄호 신경쓰기!!체크
//			if(arrs[i] > arrs[i+1]) {
//				int temp = arrs[i+1];
//				arrs[i+1] = arrs[i];
//				arrs[i] = temp;
//			}
//		}
////		#3 출력값 1 2 3 4 5 ??  사진상 for 문 하나 더 써야하는데.... 
//		for(int i=0; i < 2; i++) {    //for문바꿀때괄호 신경쓰기!!체크
//			if(arrs[i] > arrs[i+1]) {
//				int temp = arrs[i+1];
//				arrs[i+1] = arrs[i];
//				arrs[i] = temp;
//			}
//		}
////		#4 출력값 1 2 3 4 5  
//		for(int i=0; i < 1; i++) {    //for문바꿀때괄호 신경쓰기!!체크
//			if(arrs[i] > arrs[i+1]) {
//				int temp = arrs[i+1];
//				arrs[i+1] = arrs[i];
//				arrs[i] = temp;
//			}
//		}
		
		for(int num: arrs)
			System.out.print(num + "  ");   // " " 개행!!
		
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[1];
//			arrs[1] = arrs[0];
//			arrs[0] = temp;
//		}
//		if(arrs[1] > arrs[2]) {
//			int temp = arrs[2];
//			arrs[1] = arrs[1];
//			arrs[0] = temp;
//		}
//		if(arrs[2] > arrs[3]) {
//			int temp = arrs[3];
//			arrs[1] = arrs[2];
//			arrs[0] = temp;
//		}
//		if(arrs[3] > arrs[4]) {
//			int temp = arrs[4];
//			arrs[4] = arrs[3];
//			arrs[3] = temp;
		}	  
	}       // 괄호 신경쓰기!!!(에러남!!!!)

