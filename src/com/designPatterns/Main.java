package com.designPatterns;

import com.designPatterns.Facade.Facade;
import com.designPatterns.Singleton.LazyHolder.LazyHolder;
import com.designPatterns.Singleton.SingletonEager.SingletonEager;
import com.designPatterns.Singleton.SingletonLazy.SingletonLazy;
import com.designPatterns.Strategy.AggressiveBehaviour;
import com.designPatterns.Strategy.Behaviour;
import com.designPatterns.Strategy.DefensiveBehaviour;
import com.designPatterns.Strategy.NormalBehaviour;
import com.designPatterns.Strategy.Robot;

public class Main {
	
	public static void main(String[] args) {
		/**
		 * SINGLETON
		 */
		/*
		SingletonLazy singletonLazy = SingletonLazy.getInstance();
		SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
		System.out.println(singletonLazy);
		System.out.println(singletonLazy2);
		//Same instance
		
		SingletonEager singletonEager = SingletonEager.getInstance();
		SingletonEager singletonEager2 = SingletonEager.getInstance();
		System.out.println(singletonEager);
		System.out.println(singletonEager2);
		//Same instance
		//Same instance
		
		LazyHolder lazyHolder = LazyHolder.getInstance();
		LazyHolder lazyHolder2 = LazyHolder.getInstance();
		System.out.println(lazyHolder);
		System.out.println(lazyHolder2);
		//Same instance
		*/
		
		/**
		 * STRATEGY
		 */
		/*
		Behaviour defensive = new DefensiveBehaviour();
		Behaviour aggressive = new AggressiveBehaviour();
		Behaviour normal = new NormalBehaviour();
		
		Robot robot = new Robot();
		//robot.setStrategy(defensive);
		//robot.setStrategy(aggressive);
		robot.setStrategy(normal);
		robot.move();
		//Setting class strategy
		*/
		
		/**
		 * Facade
		 */
		Facade facade = new Facade();
		facade.migrateClient("Joao", "000.0000");
	}

}
