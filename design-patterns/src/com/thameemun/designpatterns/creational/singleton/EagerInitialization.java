package com.thameemun.designpatterns.creational.singleton;

/*
 *  Class Loading Object Got Created
 *  Easy to create
 *  Drawback is even though we don't use object it is getting created
 *  Exception Handling also not possible
 */
public class EagerInitialization {
	public static void main(String[] args) {
		System.out.println(Singleton.getObject());
		System.out.println(Singleton.getObject());
		System.out.println(Singleton.getObject());
		System.out.println(Singleton.getObject());
		System.out.println(Singleton.getObject());
	}
}

class Singleton {
	private static Singleton singleton = new Singleton();

	private Singleton() {

	}

	public static Singleton getObject() {
		return singleton;
	}
}