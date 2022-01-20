package com.designPatterns.Strategy;

public class Robot {
	
	private Behaviour strategy;

	public Behaviour getStrategy() {
		return strategy;
	}

	public void setStrategy(Behaviour strategy) {
		this.strategy = strategy;
	}
	
	public void move() {
		strategy.move();
	}

}
