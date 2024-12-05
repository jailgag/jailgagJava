package com.jailgag.day05.array;

public class Exam_DeepCopy {
	public static void main(String[] args) {
		int origins [] = {24, 11, 18, 25, 5, 2};
		//깊은 복사하는 코드
		int copied [] = new int[6];
		for(int i = 0; i < copied.length; i++) {    //length 주로 에러 철자 틀리거나
			copied[i] = origins[i];              	//= 표시 안함..... 
		}
		copied[0] = 25;
		origins[3] =26;
		for(int i = 0; i < copied.length; i++)
			System.out.print(copied[i]+ " ");
		System.out.println();     //개행 
		for(int i = 0; i < origins.length; i++)
			System.out.print(origins[i]+ " ");
	}
}
