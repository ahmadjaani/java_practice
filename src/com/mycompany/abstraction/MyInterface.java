package com.mycompany.abstraction;

public interface MyInterface {
	void foo(); //public and abstract

	public abstract void bar();
}

class MyInterfaceImpl1 implements MyInterface{

	@Override
	public void foo() {
		System.out.println("foo from "+ this.getClass().getName());
	}

	@Override
	public void bar() {
		System.out.println("bar from "+ this.getClass().getName());
		
	}
	
}

class MyInterfaceImpl2 implements MyInterface{

	@Override
	public void foo() {
		System.out.println("foo from "+ this.getClass().getName());
		
	}

	@Override
	public void bar() {
		System.out.println("bar from "+ this.getClass().getName());
		
	}
	
}