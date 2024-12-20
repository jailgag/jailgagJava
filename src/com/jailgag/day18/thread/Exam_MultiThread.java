package com.jailgag.day18.thread;

		class DownloadFiles implements Runnable {  //

			@Override
			public void run() {
				String [] files
				= {"document.pdf", "image.jpg" , "video.mp4"};
				for(String file : files) {                      //바뀌어요!!!
					System.out.println(file + ("다운로드중..."));
					try {                                  //try 적고 콘트롤 스페이스바 인셉션!!!
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO: handle exception
					}
				}
				
			}
			
		}
		
		
		class PrintNumbers implements Runnable{

			@Override
			public void run() {
				for(int i = 0; i < 5; i++ ) {
					System.out.println(" 숫자" +i);
					try {
						Thread.sleep(1000);
					//Tread. sleep
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
		
		
	}

	public class Exam_MultiThread {
		public static void main(String[] args) {
			/*
			 * printNumbers 와 downloadFiles를 쓰레스로 만들어서
			 * 실행하기!!!
			 * 
			 *
			 */
			Thread printNumbers = new Thread(new PrintNumbers());
			Thread downloadFiles = new Thread(new DownloadFiles());//에러 찾기!!
			 printNumbers.start();
			 downloadFiles.start();
		}
	}
			