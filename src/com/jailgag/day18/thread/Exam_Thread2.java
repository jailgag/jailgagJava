package com.jailgag.day18.thread;

class CountUp extends Thread{
	@Override
	public void run() {     //순서 연습!!!
		for(int i = 0; i < 5; i++ ) {
			System.out.println(i);
			try {
				Thread.sleep(500);
				//Tread. sleep
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //전달값으로 밀리초를 받음, 1ms = 1/1000초 ,1000ms는 몇초??0.5초
			
		
	}
	
}

}
class CountDown extends Thread {
	@Override
	public void run() {
		
	for(int i= 69; i >= 65; i--) {
		System.out.println((char)i);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}

public class Exam_Thread2 {
	public static void main(String[] args) {
		CountUp cUp = new CountUp();
		cUp.start();
		CountDown cDown = new CountDown();
		cDown.start();    //오타!!
		
		}
	}

