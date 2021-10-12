package com.mycompany.abstraction;

public class Rabbit implements Prey{

	@Override
	public void flee() {
		System.out.println("Rabbit(a prey) must flee from Predators");
	}

}
