package com.jailgag.day12.oop.exercise;

public class Person {
	//필드
	private String name;
	private int age;
	
	
	//생성자 - 클래스 이름과 같으 메소드, 반환형이 없음 그냥 없음
	public Person() {}
	
	//매개변수가 있는 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//메소드
	//getter/settter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;  //Type mismatch: cannot convert from int to String 에러코드무엇?
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {    
		this.age = age;
	}
	
	//일반메소드
	
	public String inform() {
		return name + "님(" + age + "세)";     //<--여기부터 다시작성!!!이해안되었음..
	}
		
	@Override
	public String toString() {   // toString 적고 컨트롤 스페이스바!!
		return "이름 : " + name + ", 나이 :" + age; //<--연습!!
		
	}	
		public static void main(String[] args) {
			Person [] pArr = new Person[3];
			pArr[0] = new Person();
			System.out.println(pArr[0].getAge()); //<--여기가문제??
			
			
//			pArr[0].getAge();  //이거쓰면 밑에 에러 뜸!!!
			//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "com.jailgag.day12.oop.exercise.Person.getAge()" because "pArr[0]" is null
//			at com.jailgag.day12.oop.exercise.Person.main(Person.java:47)

		}
	
}