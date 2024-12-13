package com.jailgag.day12.javvaapi;

public class Exam_StringBuffer {    
	public static void main(String[] args) {
		String data1 = "Helow";  //공간에서 재활용!!
		String data2 = " ";
		String data3 = "JAVA";
		//문자열 연결하여 Hello JAVA를 출력해보세요
		System.out.println(data1+data2+data3);
		System.out.println(data1.concat(data2).concat(data3));
		System.out.println();
		//StringBuffer를 이용해서 연결 (메모리 절약)
		StringBuffer stb = new StringBuffer();
		stb.append("Hello").append(" ").append("JAVA");
		System.out.println("연결된 문자열 : " +stb.toString());
		stb.reverse();   //거꾸로 출력!!! ppt예제코드 작성하면 복습된다함!!
		System.out.println("연결된 문자열 : " +stb.toString());
		
 	}
}
