package com.designPatterns.Singleton.LazyHolder;

/**
 * 
 * @author joao
 *
 * Lazy Holder
 * better performance, thread safe
 */
public class LazyHolder {
	
	private static class Holder {
		public static LazyHolder instance = new LazyHolder();
	}
	
	private LazyHolder() {
		super();
	}
	
	public static LazyHolder getInstance() {
		return Holder.instance;
	}
}
