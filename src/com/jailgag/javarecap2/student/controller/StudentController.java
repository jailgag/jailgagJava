package com.jailgag.javarecap2.student.controller;

import java.util.List;

//import com.jailgag.day.javareacp.view.StudentView;
import com.jailgag.javarecap2.student.model.StudentManage;
import com.jailgag.javarecap2.student.model.vo.Student;
import com.jailgag.javarecap2.student.view.StudentView;

public class StudentController {
	private static final String MOD_ITEM = "수정";
	private static final String BYE_MSG = "프로그램이 종료되었습니다";
	private static final String MOD_MSG = "데이터가 수정되었습니다";
	private static final String DEL_ITEM = "삭제";
	private static final String DEL_MSG = "데이터가 삭제되었습니다";
	private static final String SEARCH_ITEM = "검색";
	private static final String DATA_NO_FOUND = "데이터가 존재하지 않습니다";

	public static void main(String[] args) {
		StudentView view = new StudentView(); //***임포트 위치설정잘해주기!!그래야 view랑 manage 잘찾아간다!!
		StudentManage manage = new StudentManage(); //***임포트
		end:
		while(true) {
			int choice = view.printMenu();
			switch(choice) {
			case 1: 
				//1.학생 정보 등록
				Student student = view.inputStudent(); //첫빨간Student 임포트잘해주기!!
				manage.insertStudent(student);
				break;
			case 2 :
				//2.학생 정보 수정
				String name = view.inputName(MOD_ITEM);
				int index = manage.searchIndexByname(name);
				if(index > -1) {
					student = view.modifyScore();//이거 적어주니 에러 사라짐!
					manage.updateStudent(index, student); //The local variable student may not have been initialized
					view.printMessage(MOD_MSG);
				}
				break;
			case 3 :
				//학생정보 삭제
				name = view.inputName(DEL_ITEM);
				manage.deleteStudent(name);
				view.printMessage(DEL_MSG);
				break;
			case 4: 
				//4학생 정보 조회
				List<Student> sList = manage.getStudents();
				view.printAllStudents(sList);
				break;
			case 5 :
				//5학생 정보검색
				name = view.inputName(SEARCH_ITEM);
				sList = manage.searchListByName(name);
				if(sList.isEmpty()) {
					view.printAllStudents(sList);
				}else {
					view.printMessage(DATA_NO_FOUND);
				}
				break;
			case 0 :
				view.printMessage(BYE_MSG);
				break end;
			default : break;
			}
		}
	}
}
