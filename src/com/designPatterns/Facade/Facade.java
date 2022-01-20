package com.designPatterns.Facade;

import com.designPatterns.Facade.Subsystem.PostalCodeSubsystem;
import com.designPatterns.Facade.Subsystem.Subsystem;

public class Facade {

	public void migrateClient(String name, String postalCode) {
		String city = PostalCodeSubsystem.getInstance().searchForCity(postalCode);
		String state = PostalCodeSubsystem.getInstance().searchForState(postalCode);
		Subsystem.saveClient(name, postalCode, city, state);
	}
}
