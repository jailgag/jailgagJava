package com.jailgag.day08.oop;
/*
 * 접근지정자(제한자)
 * 종류 :public, protected, default, private
 */
class Sample {
	public int everyone;
	private int onlyme;
	int onlyus;
}



public class Exam_Access {
	public static void main(String[] args) {
		Sample smp = new Sample();
		smp.everyone = 1118;
//		smp.onlyme = 0;  <----요건안됨!!!! pdf파일보고 이해해볼것!!
		smp.onlyus = 502;
	}

}
