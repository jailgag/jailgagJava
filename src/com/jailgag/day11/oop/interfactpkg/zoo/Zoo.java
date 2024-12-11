package com.jailgag.day11.oop.interfactpkg.zoo;

public class Zoo {
	public static void main(String[] args) {
		ZooKeeper zooKeeper = new ZooKeeper();  //<----빨간줄있었는데 컨트롤+스페이스바 누르니 사라짐!!
		Bear bear = new Bear();         //인터페이스가 있고없고 차이점!!알아 볼것!!
		zooKeeper.feed(bear);
		zooKeeper.feed(new Camel());
		zooKeeper.feed(new Deer());
	}
}
