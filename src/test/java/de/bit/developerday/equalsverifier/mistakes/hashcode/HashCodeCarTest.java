package de.bit.developerday.equalsverifier.mistakes.hashcode;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class HashCodeCarTest {

	@Test
	public void test() {
		EqualsVerifier.forClass(HashCodeCar.class).verify();
	}

}
