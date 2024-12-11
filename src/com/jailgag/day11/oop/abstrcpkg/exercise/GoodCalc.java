package com.jailgag.day11.oop.abstrcpkg.exercise;

public class GoodCalc extends Calculator {

	@Override
	public int add(int a, int b) {
		int result = a+b;
		return result;
	}

	@Override
	public int subtract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] a) {
		// TODO Auto-generated method stub
		//int [] a = new int[5];
		//평균 = 합 / 크기
		//합 : 배열에 있는 값을 꺼내서 더해(누적합)
		int sum=0;
		for(int i =0; i < a.length; i++) {
			sum += a[i];
		}
		double avg = (double) sum / a.length;
		return avg;
	}
	public static void main(String[] args) {
//		Cannot instantiate the type Calculator  <--에러메세지!
//		Calculator caculator = new Calculator();// 추상클래스니깐 생성이 안됨!!
		Calculator caculator = new GoodCalc();//방법은!!GoodCalc로바꿈!!!
		System.out.println(caculator.add(11,18));
		System.out.println(caculator.subtract(11,18));
		int [] nums = {11,18,5,2};
		System.out.println(caculator.average(nums));
		//영상보고 다시 복습!!!
		
		
		
		
		
		
		
//		
//		GoodCalc calc = new GoodCalc();
//		System.out.println(calc.add(11,18));
//		System.out.println(calc.subtract(11,18));
//		int [] nums = {11,18,5,2};
//		System.out.println(calc.average(nums));
	//	calc.add(11,18);
		
	}

}
