package com.singleton;

public class Singleton {

	public static Singleton singleton;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
			return singleton;
		} else {
			return singleton;
		}
	}
	
	public static void main(String[] args) {
		Singleton s1 = getInstance();
		Singleton s2 = getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
