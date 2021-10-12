package com.mycompany.abstraction;

public class Hawk implements Predator {

	@Override
	public void hunt() {
		System.out.println("Hawk(a predator) must hunt preys");
	}

}
