package com.jailgag.day11.oop.interfactpkg;

public class SamsungPhone implements PhoneInterface {

	@Override
	public void printLogo() {
		System.out.println("======= SAMSUNG =====");
		
	}

	@Override
	public void sendCall() {
		System.out.println("====== SAMSUNG CALL =======");
		
	}
	public static void main(String[] args) {
		//
		
		PhoneInterface phone = new SamsungPhone();     //<--이게 동적바인드 동작??
		phone.printLogo();
		phone.sendCall();
		
		
		
		
		SamsungPhone sPhone = new SamsungPhone();
		sPhone.printLogo();
		sPhone.sendCall();
	}

}
