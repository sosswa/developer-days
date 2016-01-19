package de.bit.developerday.equalsverifier.mistakes.signature;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class SignatureCarTest {

	@Test
	public void test() {
		EqualsVerifier.forClass(SignatureCar.class).verify();
	}

}
