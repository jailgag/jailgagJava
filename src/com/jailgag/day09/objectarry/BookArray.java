package com.jailgag.day09.objectarry;

import java.util.Scanner;

class Book {
	String name;
	String author;
	String price;               //<----바꿈...
	String publisher;
	
	public Book() {
//		name ="";
//		author ="";
//		price = "";        
//		publisher = "";
		
	}
	
	void pirntInfomation() {
		System.out.println(name + "의 작가는 " + author + "입니다. 출판사는"
				+ publisher + " 이고, 가격은" + price+ "입니다");
	}
}

public class BookArray {
	public static void main(String[] args) {
//		Book book = new Book();
//		book.name = '자바의신';       // <--- 에러
//		book.author ='김자바';
//		book.p
//		
		Scanner sc = new Scanner(System.in);
		Book [] books = new Book[5]
		for(int i =0; i< books.length ; i++)
				books[0] =new Book();
		
	}
}
