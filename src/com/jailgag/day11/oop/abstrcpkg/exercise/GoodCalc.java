package com.jailgag.day11.oop.abstrcpkg.exercise;

public class GoodCalc extends Calculator {   //<---쓰고 빨간줄 클릭 오버라이딩??

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
	public double average(int[] a) {    //<---빨간줄 클릭 후 바뀜..왜 비뀜??return값잇어서 에러..
		// TODO Auto-generated method stub
		// int [] a = new int[5];
		//평균 = 합 / 크기
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		double avg = (double)sum / a.length;
		return avg;
	}
	public static void main(String[] args) {
		//Cannot instantiate the tyoe Calculator
		Calculator calcultor = new Calculator();
		Calculator calcultor = new GoodCalc();
		System.out.println(calculator.add(11, 18));
		System.out.println(calculator.substract(11, 18));
		int [] arrs = {11, 18, 5 ,2};
		System.out.println(calculator.average(arrs));
		
		
		GoodCalc calc = new GoodCalc();
		System.out.println(calc.add(11,18));
		System.out.println(calc.substract(11,18));
		int [] nums = {11, 18, 5, 2};
		System.out.println(calc.average(nums));
	}
}
