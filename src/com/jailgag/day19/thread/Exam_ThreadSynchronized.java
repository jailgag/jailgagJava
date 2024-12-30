package com.jailgag.day19.thread;
//일단 실행시킴!!! 다시 연습!!복습!!!
public class Exam_ThreadSynchronized {
	 public static void main(String[] args) {
		SharedBoard board= new SharedBoard();//오타조심!!
		Thread th1 = new Thread(new StudentThread("", board));
		th1.setName("OfCoffee");
		Thread th2 = new Thread(new StudentThread("", board));
		th2.setName("MegaCoffe");
		th1.start();
		th2.start();
	}
}

class StudentThread implements Runnable {
	//필드 ,멤버 변수
	private SharedBoard board;  //임포트
	//생성자,,기본생성자
	public StudentThread() {
		
		
	}
	
	
	//매개변수가 있는 생성자!!
	public StudentThread(String name, SharedBoard board) {
		this.board= board; //단어가 어렵다!!연습!!!
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			board.add();
		}
		
	}  //오버라이딩!!
	
}

class SharedBoard {
	
	private int sum = 0;
	public void add() {
		int n = sum;
		Thread.yield();
		n += 10;
		sum= n;
		
		System.out.println(Thread.currentThread().getName()+ ":" +sum);
	}
	public int getSum() {
		return sum;  //빨간줄 void를 int로 바꿔줌!!!
	}
}