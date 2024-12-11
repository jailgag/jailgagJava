package com.jailgag.day11.oop.object.exercise;

public class Point {
	private int x, y;
	
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;   //밑에 오버라이드를 주석처리하면 다릅니다 출력!!
	}                 //equals 개념?정리?!!        
	@Override
	public boolean equals(Object obj) {
		Point p =(Point)obj;
		return this.x ==p.x && this.y == p.y;
//		return super.equals(obj);
	}
	
}
