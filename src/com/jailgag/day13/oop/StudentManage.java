package com.jailgag.day13.oop;

//import java.util.Scanner;
//저장하고 로드하는 기능 클래스
public class StudentManage {
	private Student [] students;   //Static으로 바꿈!! 순서반복!!몬가바뀜!!
	private int     index;  //<---이놈 추가!!!!     //지우고private 로바꿈!!
	
	public StudentManage() {
		students = new Student[3];   //(index로바꿔주는거!!
		index = 0;
	}
	
	
	public void insertStudent(Student student) {
//		Scanner sc = new Scanner(System.in);
		students[index] =  student;  //올라옴!! 
//		String name = sc.next();  //sc cannot be resolved 에러!!
//		students[index].setName(name);
//		students[index].setKor(sc.nextInt());
//		students[index].setEng(sc.nextInt());
//		students[index].setMath(sc.nextInt());  //바꾼거 연습!!!
		index++;
		
		//		for(int i = 0; i < students.length; i++) {   //포문위에 index추가후임포트
//			students[i] = new Student();
//			students[i].name = "일용자";
//			students[i].kor = "99";
//			students[i].eng = "87";
//			students[i].math = "88";   //쓰고 포문은 없앰!!!!
//			
//		}
		}
	public Student [] getStudents() {
		return students;   //<-이게 null값으로 되니 ...students로변경
		
	}
}
