package com.jailgag.day11.oop.interfactpkg.Animalfarm;

public class Yard {
	public static void main(String[] args) {
		Animal animal = new Cat();
		animal = new Dog();
		animal = new Hen();
		animal.speak();
	}
}
