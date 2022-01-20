package com.designPatterns.Strategy;

public class AggressiveBehaviour implements Behaviour {

	@Override
	public void move() {
		System.out.println("Robot moved aggressively");
	}

}
