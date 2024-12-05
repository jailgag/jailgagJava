package com.jailgag.day05.array;

public class Exam_HallowCopy {
	public static void main(String[] args) {
//		int [] arrs = new int[6];
//		arrs[0] = 24;
//		arrs[1] = 11;
//		arrs[2] = 18;
//		arrs[3] = 25;     //이것도 다시써보고 실행 
//		arrs[4] = 5;
//		arrs[5] = 2;
		int [] dates = {24, 11, 18, 25, 5, 2};
		int [] copied = dates;
		copied[0] = 25;
		dates[3] = 26;
		for(int i = 0; 1 < copied.length; i++) {
			System.out.print(copied[i]+ " ");
		}
		System.out.println();
		for(int i= 0; i < copied.length; i++) {
			System.out.println(dates[i]+ " ");
			
		}
		System.out.println();  // 아마 개행??
		System.out.println(dates.hashCode());
		System.out.println(copied.hashCode());
	}
}
