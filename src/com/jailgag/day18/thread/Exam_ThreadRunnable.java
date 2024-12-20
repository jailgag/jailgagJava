package com.jailgag.day18.thread;


class CountUpRunnable implements Runnable{

	@Override
	public void run() {                          //적고 오버라이딩!!!
		
		for(int i = 0; i < 5; i++ ) {
//			System.out.println(i);
			System.out.println(
					Thread.currentThread().getName()  + " :" + i);
			try {
				Thread.sleep(500);
				//Tread. sleep
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //전달값으로 밀리초를 받음, 1ms = 1/1000초 ,1000ms는 몇초??0.5초
		// TODO Auto-generated method stub
		
	}
	
}
}
class CountDownRunnable implements Runnable {

	@Override
	public void run() {
		for(int i= 69; i >= 65; i--) {   //69//65로바뀜...
//			System.out.println(i);
			System.out.println(
					Thread.currentThread().getName() + " :"+ (char)i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		// TODO Auto-generated method stub
		
	}
	
}
}


public class Exam_ThreadRunnable {
public static void main(String[] args) {
		
		//여기적어야함!!!!
		
		Thread thread1 = new Thread(new CountUpRunnable());   //다음꺼적
		Thread thread2 = new Thread(new CountDownRunnable());  //오타!! //CountDownRunnable cannot be resolved to a type
		thread1.start();                                       //원인 괄호문제!!!!!!
		thread2.start();                                       //CountDownRunnable을 유형으로 확인할 수 없습니다.
		                                                  
		
	}
}

