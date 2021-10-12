package com.mycompany.abstraction;

public abstract class AbstractDemo {
	private int id;
	
	public static int m = 112;
	
	AbstractDemo(){}
	
	
	AbstractDemo(int k){
		m = k;
	}
	
	
	public abstract void foo();
	
	public void bar() {
		System.out.println("bar from AbstractDemo");
	}
}

class  Child extends AbstractDemo{
	
	

	@Override
	public void foo() {
		System.out.println("foo implemented in Child");
	}
}