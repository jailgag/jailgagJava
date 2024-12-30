package com.jailgag.day19.thread;

class PrintNumbers implements Runnable { //1.실습

	@Override
	public void run() {
		for(int i = 1; i <6; i++ ) {
			System.out.println("숫자 :" +i);
			try {                   //try 콘스!!(수정) 자습때시작!!
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	}
	
}
} //갈호 에러!!

class DownloadFiles implements Runnable {

	@Override
	public void run() {
		String [] files = {"document.pdf", "image.jpg", "vided.mp4"};
		for(String file: files) {
			System.out.println(file+" 다운로드 중...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
		
	}
	


public class Exam_MultiThread {
	public static void main(String[] args) {
		Thread nThread = new Thread(new PrintNumbers());
		Thread dThread = new Thread(new DownloadFiles());
		
		nThread.start();
		dThread.start();
		
//		
//		//기존 싱글스레드
////		printNumbers();
////		downloadFiles();   //이거적고클릭!!
//		
//	}
//
//	private static void downloadFiles() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void printNumbers() {
//		// TODO Auto-generated method stub
//		
	}
}
