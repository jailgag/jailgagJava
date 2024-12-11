package com.jailgag.day11.oop.interfactpkg.musician;

public class Musician {
	public void play(Instrument instrument) {
		instrument.paly();//<----빨간줄 있었는데 몬가해서 사라짐...
	}
	
	
//	public void play(Chello chello) {
//		System.out.println("아름다운 첼로 소리~"); 
//	}
//	public void play(Drum drum) {
//		System.out.println("신나는 드럼 소리~!!");
//	}
//	public void play(Guitar guitar) {
//		System.out.println("멋있는 기타 소리~!!");
//	}
}
