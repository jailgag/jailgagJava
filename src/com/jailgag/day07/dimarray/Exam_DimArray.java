package com.jailgag.day07.dimarray;

public class Exam_DimArray {
	public static void main(String[] args) {
		int num = 0;
		int [] nums = new int[10];
		int [][] dimNums = new int[5][5]; //2차원배열 ??은 중첩for문으로 나타낸다
		System.out.println("행의 길이 : " + dimNums.length);
		System.out.println("열의 길이 : " + dimNums[0].length);
		// 1 2 3 4 5 
		// 6 7 8 9 10
		//11 12 13 14 15
		//16 17 18 19 20      //사진참고 강사님코드참고 작성및 ...이해하기??
		//21 22 23 24 25
		dimNums[0][0] = 1;
	}
}
