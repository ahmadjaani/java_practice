package com.mycompany.abstraction;

public class TestMyInterface {
	
	public static void main(String[] args) {
		MyInterface myInterface = null;
		
		MyInterfaceImpl1 myInterfaceImpl1 = new MyInterfaceImpl1();
		MyInterfaceImpl2 myInterfaceImpl2 = new MyInterfaceImpl2();
		
		myInterface = myInterfaceImpl1;
		myInterface.foo();
		
		myInterface = myInterfaceImpl2;
		myInterface.bar();
	}
}
