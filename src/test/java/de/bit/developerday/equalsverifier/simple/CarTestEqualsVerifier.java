package de.bit.developerday.equalsverifier.simple;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class CarTestEqualsVerifier {

	@Test
	public void testEqualHashCode() {

		// Minimal equals verifier call.
		// Pretty sweet...
		EqualsVerifier.forClass(Car.class).verify();
	}

}
