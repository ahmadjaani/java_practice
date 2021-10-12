package com.collabera.oops;

public class Demo {

	static String text;

	public static void main(String[] args) {
		print();
		System.out.println("Realize!"); // 3
	}

	//static block
	static {
		System.out.println("Before : " + text);
		text = "Real Eyes!";
		System.out.println("After : " + text); // 1
	}

	static void print() {
		System.out.println("Real Lies!"); // 2
	}
}
