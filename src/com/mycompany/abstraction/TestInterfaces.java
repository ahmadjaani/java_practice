package com.mycompany.abstraction;

public class TestInterfaces {

	public static void main(String[] args) {
		// polymorphism : one thing many forms
		AInterface aInterface = null;
		BInterface bInterface = null;
		
		aInterface = new AbImpl();
		aInterface.aMethod();
		
		bInterface = new AbImpl();
		bInterface.bMethod();
	}

}
