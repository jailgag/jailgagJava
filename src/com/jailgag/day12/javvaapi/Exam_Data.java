package com.jailgag.day12.javvaapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exam_Data {
	public static void main(String[] args) {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SS");  //이거2개 복붙올려주고!!
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
		// ==================== 권장 사항 ================
		Calendar calendar = new GregorianCalendar();  //2개 임포트 해주고!!
		System.out.println(calendar.getTime());  //.get 누르고getATime선택!!
//		String changed = trans. //trans cannot be resolved to a variable 에러내용알기!!
		String changed = sdf.format(calendar.getTime());
		System.out.println("그레고리안 달력 날짜 변환 : " + changed);
		
		
		
		
//		
//		Date date = new Date(); //**Date 임포트방법 2개!!!**
//		System.out.println(date);
//		String transDate1 = sdf.format(date);//sdf2 cannot be resolved 무슨에러?
//		System.out.println(transDate1);  //다시복습하기!!출력이 바뀜...!!
//		String transDate2 = sdf2.format(date);//sdf2 cannot be resolved 무슨에러?
//		System.out.println(transDate2);  //다시복습하기!!출력이 바뀜...!!
//		
		Date date = new Date(); //**Date 임포트방법 2개!!!**
		System.out.println(date);
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SS");
		String transDate1 = sdf.format(date);//sdf2 cannot be resolved 무슨에러?
		System.out.println(transDate1);  //다시복습하기!!출력이 바뀜...!!
//		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
		String transDate2 = sdf2.format(date);//sdf2 cannot be resolved 무슨에러?
		System.out.println(transDate2);  //다시복습하기!!출력이 바뀜...!!
		
		
		
		
		
		
	}
}
