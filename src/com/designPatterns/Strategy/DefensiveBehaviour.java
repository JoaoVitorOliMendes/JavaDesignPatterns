package com.designPatterns.Strategy;

public class DefensiveBehaviour implements Behaviour {

	@Override
	public void move() {
		System.out.println("Robot moved defensively");
	}

}