package com.mycompany.abstraction;

public class AbImpl implements AInterface, BInterface{

	@Override
	public void bMethod() {
		System.out.println("bMethod implemented from BInterface");
	}

	@Override
	public void aMethod() {
		System.out.println("aMethod implemented from AInterface");
	}

}
