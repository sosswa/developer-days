package de.bit.developerday.equalsverifier.mistakes.nonfinal;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class NonfinalCarTest {

	@Test
	public void test() {

		EqualsVerifier.forClass(NonfinalCar.class).verify();

		// Suppress warning for non final equal / hashCode method
		// EqualsVerifier.forClass(NonfinalCar.class).suppress(Warning.STRICT_INHERITANCE).verify();

		// Supress warning for non final fields
		// EqualsVerifier.forClass(NonfinalCar.class).suppress(Warning.STRICT_INHERITANCE,
		// Warning.NONFINAL_FIELDS).verify();
	}

}
