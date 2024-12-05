package com.jailgag.day06.array.sort;

public class Exam_selectionSort {
	/*
	 * 선택정렬이란??
	 * 배열을 전부 검색하여 최소값을 고르고 왼쪽부터 채워나가는 정렬
	 * 데이터 양이 적을때 좋은 성능을 보여주는 정렬
	 * 데이터 양이 적을때 급격한 성능 저하를 보임
	 * 
	 * 
	 * 연습할때 괄호 주의!!!!실수남...
	 */
	
	
	public static void main(String[] args) {
		int [] arrs = {2, 5, 4, 1, 3};
		int min =0;
		for(int j = 1; j < arrs.length; j++) {
			if(arrs[0] > arrs[j]) {
				min =j;
			}
		}
		int temp = arrs[0];         // 출력값 1 4 5 2 3   *** 다쓰면 노트에다가 적어서
		arrs[0] = arrs[min];        // 이해 해볼것!!!
		arrs[min] = temp;
			
		for(int j = 2; j < arrs.length; j++) {
			if(arrs[1] > arrs[j]) {
				min =j;
			}
		}
		temp = arrs[1];         // 복붙하면  j = 2 로 바꿈 int temp 에서 int 삭제
		arrs[1] = arrs[min];
		arrs[min] = temp;             // 출력값2 : 1 5 4 1 3
		for(int num: arrs) {          // 다음에 (사진참조) 0 값을 1로 바꿈 출력값 1 3 4 2 5 
				System.out.print(num  + " ");
			
			
		}
//	if(arrs[0] > arrs[1]) {
//		//인덱스 값을 기억
//		min =1;
//	}
//	if(arrs[0] > arrs[2]) {
//		min = 2;
//	}
//	if(arrs[0] > arrs[3]) {
//		min = 3;
//	}
//	if(arrs[0] > arrs[4]) {
//		min = 4;
//	}
	}
}

