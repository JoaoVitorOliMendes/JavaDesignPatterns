package com.designPatterns.Singleton.SingletonLazy;

/**
 * 
 * @author joao
 *
 * "Lazy" Singleton
 */
public class SingletonLazy {

	private static SingletonLazy instance;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstance() {
		if (instance == null) {
			instance = new SingletonLazy();
		}
		return instance;
	}
}
