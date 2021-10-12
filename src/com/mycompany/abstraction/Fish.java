package com.mycompany.abstraction;

public class Fish implements Prey, Predator {

	@Override
	public void hunt() {
		System.out.println("Big Fish hunts small fishes");
	}

	@Override
	public void flee() {
		System.out.println("Small fish flees from Big Fishes");
	}

}
