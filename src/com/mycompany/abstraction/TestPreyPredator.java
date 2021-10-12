package com.mycompany.abstraction;

public class TestPreyPredator {

	public static void main(String[] args) {
		Prey prey = null;
		
		prey = new Fish();
		prey.flee();
		
		
		prey = new Rabbit();
		prey.flee();
		
		
		Predator predator = null;
		predator = new Hawk();
		predator.hunt();
		
		
	}

}
