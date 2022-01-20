package com.designPatterns.Strategy;

public class NormalBehaviour implements Behaviour {

	@Override
	public void move() {
		System.out.println("Robot moved normally");
	}

}
