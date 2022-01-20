package com.designPatterns.Facade.Subsystem;

/**
 * 
 * @author joao
 *
 * Subsystem example
 */
public class Subsystem {
	
	public static void saveClient(String name, String postalCode, String state, String city) {
		System.out.println("Client successfully saved!");
		System.out.print("Client data: " + name + ", " + postalCode + ", " + state + ", " + city);
	}
	
	private Subsystem() {
		super();
	}
}
