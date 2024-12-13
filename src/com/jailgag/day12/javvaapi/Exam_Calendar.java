package com.jailgag.day12.javvaapi;

import java.util.Calendar;  //임포트
import java.util.GregorianCalendar;

import javax.xml.crypto.Data;

public class Exam_Calendar {
	public static void main(String[] args) {
		// 그레고리안 달력, 이슬람력, 유대력, 태음력
		Calendar calendar = new GregorianCalendar();  //<---할때 임포트 해즘!!
		Calendar today = Calendar.getInstance();
		Calendar startDate = Calendar.getInstance();
		startDate.set(2024, 10, 18);
		startDate.set(Calendar.HOUR_OF_DAY, 9);
		startDate.set(Calendar.MINUTE, 10);
		printData(startDate);
		printData(today);
	//	#1
		//지금은 2024/12/12/목요일(16시) 오후 4시 31분 30초 0밀리초에 개강하였습니다  <--복습할때 시간바뀜!!
	
		//#2
		//2024/11/18/화요일(9시) 오전 9시 00분 0초 0밀리초에 개강하였습니다.
		

		
		
//	
//       //<---여기서today를
//		System.out.println( date.get(Calendar.HOUR_OF_DAY)+"시");  //date로 바꾸면 편함!!
//		System.out.println(date.get(Calendar.MINUTE)+"분");
//		System.out.println(date.get(Calendar.SECOND)+"초");
//		System.out.println(date.get(Calendar.MILLISECOND)+"초");
//		System.out.println(date.get(Calendar.AM_PM));
//		
//		
//		
//		System.out.println(today.get(Calendar.YEAR)+"년");
//		System.out.println(today.get(Calendar.MONTH+1)+"월");
//		System.out.println(today.get(Calendar.DAY_OF_MONTH)+"일");
//		System.out.println(today.get(Calendar.DATE)+"일");
//		System.out.println(today.get(Calendar.HOUR)+"시");
//		System.out.println(today.get(Calendar.HOUR_OF_DAY)+"시");
//		System.out.println(today.get(Calendar.MINUTE)+"분");
//		System.out.println(today.get(Calendar.SECOND)+"초");
//		System.out.println(today.get(Calendar.MILLISECOND)+"초");
//		System.out.println(today.get(Calendar.AM_PM));
//
//	
	}

	//
	public static void printData(Calendar date) {
		int year = date.get(Calendar.YEAR);  //today cannot be resolved ->today를 date로 바꿔줌!1
		int month =date.get(Calendar.MONTH+1);
		int day = date.get(Calendar.DAY_OF_MONTH);
		//요일
		int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);
		int hour = date.get(Calendar.HOUR); 
		//24시간표시
		int hourOfDay = date.get(Calendar.HOUR_OF_DAY);
		int minute = date.get(Calendar.MINUTE);
		int second = date.get(Calendar.SECOND);
		int millisecond = date.get(Calendar.MILLISECOND);
		//오전 오후
		int ampm = date.get(Calendar.AM_PM);
		String dayWeek ="";
		switch(dayOfWeek) {
		case Calendar.SUNDAY : dayWeek = "일요일"; break;
		case Calendar.MONDAY : dayWeek = "월요일"; break;
		case Calendar.TUESDAY : dayWeek = "화요일"; break;
		case Calendar.WEDNESDAY : dayWeek = "수요일"; break;
		case Calendar.THURSDAY : dayWeek = "목요일"; break;
		case Calendar.FRIDAY : dayWeek = "금요일"; break;
		case Calendar.SATURDAY : dayWeek = "토요일"; break;
		}
		String ap = "";
		if(Calendar.AM == ampm) {
			ap ="오전";
		}else {
			ap = "오후";
		}
		
		
		System.out.println("지금은 "+ year+"/"+month+"/"+day
				+"/"+dayWeek+"("+hourOfDay+"시) "+ap+""+hour+"시 "+minute+"분 "
				+second+"초" +millisecond+"밀리초입니다");
//	System.out.println("2024//11/18/화요일(9시) 오전 9시 00분 0초 0밀리초에 개강하였습니다");
	}
}
