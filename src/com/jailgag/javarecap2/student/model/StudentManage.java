package com.jailgag.javarecap2.student.model;

import java.util.ArrayList;
import java.util.List;

import com.jailgag.javarecap2.student.model.vo.Student;

public class StudentManage {
	private List<Student> sList;  //리스트 객체생성하면 에러없음!
	//리스트 객체 생성
	public StudentManage() {
		sList = new ArrayList<Student>(); //임포트주의!!콘트롤러!!
	}
	//1.학생정보 등록
	public void insertStudent(Student student) {
		sList.add(student);
		
	}
	//2.학생정보 수정
	public int searchIndexByname(String name) {
		// TODO Auto-generated method stub
		int index = 0;
		for(Student student : sList) {
			if(student.getName().equals(name)) {
				return index;
			}
			index++;   //새로운코드
		}
		return -1;  
	}
	//2.학생정보 수정
	public void updateStudent(int index, Student student) {
		Student stdOne = sList.get(index);
		student = new Student(stdOne.getName(),student.getFirstScore(),student.getSecondScore());
		sList.set(index, student); 
		
	}
	//3학생정보 삭제
	public void deleteStudent(String name) {
		// TODO Auto-generated method stub
		List<Student> searchList = this.searchListByName(name);
		for(Student student: searchList) {
			sList.remove(student);
		}
	}
	//4.학생정보조회
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return sList;
	}
	//5.학생 정보검색
	public List<Student> searchListByName(String name) {
		// TODO Auto-generated method stub
		List<Student> searchList = new ArrayList<Student>();
		for(Student student :sList) {
			if(student.getName().equals(name)) {
				searchList.add(student);
			}
		}
		return searchList;
	}
}
