package com.jailgag.day13.oop;

public class StudentController {
	public static void main(String[] args) {
		StudentView view = new StudentView();
		StudentManage manage = new StudentManage();
		exit:
		while(true) {
			int choice = view.mainMenu();  //무슨창?사용법질문!!
			switch(choice) {
			case 1: 
				Student student = view.inputStudentData();
				manage.insertStudent(student);
//				view.inputStudentData(); 12/14 이것때문에 츨력이이상했나???....
				break;                       //출력문 안나옴!!다시코딩!!
			case 2: 
				Student [] students = manage.getStudents();
//			for(int i= 0; i < 3; i++) {
//					view.printStudentData(students[i]);  <--이건또 왜 생겼을가...음..놓친게 많네ㅜ
//				}
				
				view.printStudentData(students[0]);
//			view.printStudentData(students[1]);				
//			view.printStudentData(students[2]);
				break;
			case 3:
				view.displayMessage("프로그램이 종료되었습니다");
				break exit;
				default : view.displayMessage("1부터 3사이의 수를 입력해주세요");
			}
		}
	}
}
