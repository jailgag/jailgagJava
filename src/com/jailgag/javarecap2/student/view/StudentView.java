package com.jailgag.javarecap2.student.view;

import java.util.List;
import java.util.Scanner;

import com.jailgag.javarecap2.student.model.vo.Student;

public class StudentView {
	
	public int printMenu() {  //빨간줄This method must return a result of type int
		//첫 화면 			// 첫화면 다적으면 위에러 사라짐!
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 학생 관리 프로그램=====");
		System.out.println("1.학생 정보 등록");
		System.out.println("2.학생 정보 수정");
		System.out.println("3.학생 정보 삭제");
		System.out.println("4.학생 정보 조회;");
		System.out.println("5.학생 정보 검색(이름)");
		System.out.println("0.프로그램 종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}
	//1. 학생정보 등록
	public Student inputStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====학생 정보 입력=====");
		System.out.print("이름 :");
		String name = sc.next();
		System.out.print("1차 점수 :");
		int firstScore = sc.nextInt();
		System.out.print("2차점수 :");
		int secondScore = sc.nextInt();
		Student student = new Student(name, firstScore, secondScore);
		return student;
	}
	//2.학생 정보수정
	public String inputName(String category) { //()안에 category수정
		Scanner sc = new Scanner(System.in);
		System.out.println(category + "할 이름 입력 :");
		String name = sc.next();
		return name;
	}
	//0.프로그램종료 2.학생정보수정
	public void printMessage(String message) { //갈호Message
		System.out.println(message);
		
		
	}
	//2.학생 정보 수정
	public Student modifyScore() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("1차 점수 입력 :");
		int firstScore = sc.nextInt();
		System.out.print("2차 점수 입력 :");
		int secondScore = sc. nextInt();
		Student student = new Student(firstScore, secondScore);//기본생성자!!
		return student;
	}
	//4.학생정보 조회
	public void printAllStudents(List<Student> sList) {
		// TODO Auto-generated method stub
		System.out.println("===== 학생 전체 정보 조회 ======");
		for(Student student : sList) {
			System.out.println("이름 :" + student.getName());
			System.out.println("1차점수 :" + student.getFirstScore());
			System.out.println("2차점수 :" + student.getSecondScore());;
		}
	}
	
}
