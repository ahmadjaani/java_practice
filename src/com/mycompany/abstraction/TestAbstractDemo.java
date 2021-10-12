package com.mycompany.abstraction;

public class TestAbstractDemo {
	public static void main(String[] args) {

		AbstractDemo obj = new Child();
		
		obj.foo();
		obj.bar();

	}

}
//Cannot instantiate the type AbstractDemo