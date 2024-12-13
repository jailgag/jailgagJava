package com.jailgag.day12.javvaapi;

import java.util.StringTokenizer;

public class Exam_StringToKenizer {
	public static void main(String[] args) {
		String query = "name=james&addr=seoul&age=33";
		String [] words = query.split("&");
		for(String word : words)
			System.out.println(word);
		System.out.println();  //개행!!
		StringTokenizer st = new StringTokenizer(query, "&");
		while(st.hasMoreTokens()) {              //<---다시작성해볼것!!!
			System.out.println(st.nextToken()); //얘가 더빠름!!!메모리 사용도 적게한다!!
		}
	}
}
