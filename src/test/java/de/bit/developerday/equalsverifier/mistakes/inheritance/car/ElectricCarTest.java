package de.bit.developerday.equalsverifier.mistakes.inheritance.car;

import org.junit.Test;

import de.bit.developerday.equalsverifier.inheritance.car.ElectricCar;
import nl.jqno.equalsverifier.EqualsVerifier;

public class ElectricCarTest {

	@Test
	public void test() {
		EqualsVerifier.forClass(ElectricCar.class).verify();
	}

}
