package com.jailgag.day12.javvaapi;

public class Exam_String {
	public static void main(String[] args) {
		String msg = "Hello";    //String과관련된메소드!!!!
		if("Hello"==msg) //상수풀에 있는 값을 재사용
			System.out.println("같은거임"); 
		String data = new String("Hello");
		if(msg == data) // 새로운 객체 생성되어 비교오류 -->equals 를 사용함
			System.out.println("같은 값임!!");
		else 
			System.out.println("다른값임!!");
		
		System.out.println();
		//String 객체가 가지고 있는 유용한 메소드
		//문자열 길이
		String data1 = new String(" C#"); //쌍따옴표한칸띄고 C#
		String data2 = new String(" ,C++");
		System.out.println(data1 + "의 길이는 " +  data1.length()+"입니다");
		System.out.println(data2 + "의 길이는 " + data2.length()+ "입니다");
		// 문자열이 포함 되어 있는지 체크
		System.out.println("#이 있는가? : "+ data1.contains("#"));
		//문자열 연결
		data1 = data1.concat(data2);
		System.out.println("연결된 문자열 :" +data1 );
		System.out.println();
		//문자열 공백제거 
		System.out.println("문자열 공백제거 전 : " + data1.length());
		data1 = data1.trim();
		System.out.println("문자열 공백제거 후 : " + data1.length());  //왜출력이 8,7인가...
		System.out.println();
		//문자열 교체 C# -->JAVA
		data1 = data1.replace("C#", "JAVA");   //<--안나오는지 체크!!!나옴...
		System.out.println("문자열 교체 확인 : " + data1);
		
		//data1.split(",")// .해가지고 하면 String대괄호!! 배열로 만들어짐!!연습해보기!!
		// 문자열 자르기1 - 기준 문자열 콤마전후로 잘라서 배열에 넣어줌!!!
		String [] words = data1.split(",");
		for(int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		for(String word : words)
			System.out.println(word);  //for이츠문으로 출력!!!하는방법!!
		
		//문자열 자르기2 - 인덱스 값을 기준으로 자르기!!
		System.out.println("문자열 자르기 전 "+data1);
		data1 = data1.substring(4);  //앞에 java없어지고 ,C++출력!!
//		data1 = data1.substring(0, 4);   //0번부터 4번까지 자르고...(복습해보면알듯말듯..)
		System.out.println("문자열 자른후 " + data1);  //출력문 java만 출력 
		
		//문장열을 문자로 만들기
		char word = data1.charAt(1);  //0말고 1로 찍으니 나옴...
		System.out.println("문자열--> 문자" + word);  //콤마 안나옴...복습할때봐야함!
	}
	
}
