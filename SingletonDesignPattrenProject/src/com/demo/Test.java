package com.demo;

public class Test {

	static Test t;
	
	public static Test getObject() {
		t = new Test();
		return t;
	}
	
	public static void main(String[] args) {
		System.out.println("first instance hashcode:"+getObject().hashCode());
		System.out.println("second instance hashcode:"+getObject().hashCode());
		System.out.println("third instance hashcode:"+getObject().hashCode());
	}
}
