package com.jailgag.day18.thread;

public class Exam_SingleThread {
	public static void main(String[] args) {
		
		printNumbers();
		downloadFiles();
	}
	
	static void printNumbers() {
		for(int i= 1; i<5; i++) {
			System.out.println("숫자 : "+ i);  //오버라이딩 try wjrrh
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	static void downloadFiles() {
		String [] files
		= {"document.pdf", "image.jpg" , "video.mp4"};
		for(String file : files) {
			System.out.println(file + ("다운로드중..."));
			try {                                  //try 적고 콘트롤 스페이스바 인셉션!!!
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
