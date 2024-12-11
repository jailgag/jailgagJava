package com.jailgag.day11.oop.objectpkg;

class Member {
	//필드
	String name;
	int age;
	String email;
	String phone;
	String address;
	//생성자
	public Member() {}                // <----과정 보고 적어보기!!!
	
	
	// 메소드
	//getter
	public String getName() {
		return name;
	}
	public void eat() {}
	public void sleep() {}
}

public class Exam_objectProperty {
	public static void main(String[] args) {
		Member member = new member();
		System.out.println(member.getClass().getName));
	}
}
