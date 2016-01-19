package de.bit.developerday.equalsverifier.inheritance;

import org.junit.Test;

import de.bit.developerday.equalsverifier.inheritance.point.ColoredPoint;
import de.bit.developerday.equalsverifier.inheritance.point.Point;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

public class ColoredPointTest {

	@Test
	public void testPoint() {
		EqualsVerifier.forClass(Point.class).suppress(Warning.STRICT_INHERITANCE).verify();
	}

	@Test
	public void testColoredPoint() {
		
		
		EqualsVerifier.forClass(ColoredPoint.class).withRedefinedSuperclass()
				.suppress(Warning.NULL_FIELDS, Warning.STRICT_INHERITANCE).verify();
	}

}
