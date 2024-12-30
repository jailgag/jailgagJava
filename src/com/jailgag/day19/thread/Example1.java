package com.jailgag.day19.thread;

import java.util.HashMap;

public class Example1 {
	
	public void MapExample() {
		HashMap<String, String> map = new HashMap<String, String> ();
		map.put("02", "서울");
		map.put("031", "경기도");
		
		System.out.println(map.get("02")+ "입니다");
		System.out.println(map.get("031")+ "입니다");
		//강사님 살려주세요!!!
	}
}
