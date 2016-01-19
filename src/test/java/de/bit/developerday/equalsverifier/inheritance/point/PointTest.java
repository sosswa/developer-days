package de.bit.developerday.equalsverifier.inheritance.point;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class PointTest {

	@Test
	public void test() {

		// Will fail because equals and hashCode is not final and can be
		// overridden in a sub class!
		EqualsVerifier.forClass(Point.class).verify();

		// Will success because it says that in ColoredPoint state is added and
		// an instance of colored point cannot be equal to an instance of
		// Point.
		// EqualsVerifier.forClass(Point.class).withRedefinedSubclass(ColoredPoint.class).verify();

		// Will success because it says that in ColoredPoint/ColoredPoint2 state is added and
		// an instance of ColoredPoint/ColoredPoint2 cannot be equal to an instance of
		// Point.
		// EqualsVerifier.forClass(Point.class).withRedefinedSubclass(ColoredPoint.class).withRedefinedSubclass(ColoredPoint2.class).verify();

		// Simply suppress inheritance warnings.
		// EqualsVerifier.forClass(Point.class).suppress(Warning.STRICT_INHERITANCE).verify();
	}

}
