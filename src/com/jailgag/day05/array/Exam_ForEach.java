package com.jailgag.day05.array;

public class Exam_ForEach {
	public static void main(String[] args) {
		//포문을 다르게쓰는것
		int [] nums = {24, 12, 25, 1, 2};
//		for(int i=0; i  < nums.length; i++) {     // 똑같이 출력!!!
//			System.out.println(nums[i]);
		for(int num : nums) {
			System.out.print(num+ " ");
		}
		System.out.println();
		int sum =0;
		for(int num :nums)
			sum += num;
		System.out.println("합 : " + sum);
		
		String [] fruits = {"딸기", "체리", "자두", "사과","포도","용과"};
		for(int i =0; i < fruits.length; i++) {
			System.out.println(fruits[i]+ " ");
		}
		System.out.println();
		for(String name:fruits)
			System.out.print(name+ " ");
		System.out.println();
		
	}
	
}
			
