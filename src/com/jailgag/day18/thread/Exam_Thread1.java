package com.jailgag.day18.thread;

public class Exam_Thread1 {
	public static void main(String[] args) {
//		for(int i = 0; i < 5; i++ ) {
//			System.out.println(i);
//			try {
//				Thread.sleep(500);
//			//Tread. sleep
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} //전달값으로 밀리초를 받음, 1ms = 1/1000초 ,1000ms는 몇초??0.5초
//			
//		}
		for(int i= 5; i >= 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
