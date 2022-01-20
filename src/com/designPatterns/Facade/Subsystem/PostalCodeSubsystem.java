package com.designPatterns.Facade.Subsystem;

/**
 * 
 * @author joao
 *
 * Postal code API example
 */
public class PostalCodeSubsystem {

	private static PostalCodeSubsystem instance = new PostalCodeSubsystem();
	
	private PostalCodeSubsystem() {
		super();
	}
	
	public static PostalCodeSubsystem getInstance() {
		return instance;
	}
	
	public String searchForCity(String postalCode) {
		return "New York City";		//Mocked Data
	}
	
	public String searchForState(String postalCode) {
		return "New York State";		//Mocked Data
	}
}
