package com.jailgag.day11.oop.interfactpkg.musician;

public class Stage {
	public static void main(String[] args) {
		Musician musician = new Musician();
		musician.play(new Chello());
		musician.play(new Drum());
		musician.play(new Guitar());
	}
}
