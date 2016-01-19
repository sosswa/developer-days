package de.bit.developerday.equalsverifier.inheritance.point;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

public class ColoredPointTest {

	@Test
	public void test() {
		 EqualsVerifier.forClass(ColoredPoint.class).suppress(Warning.NULL_FIELDS).verify();
//		EqualsVerifier.forClass(ColoredPoint.class).suppress(Warning.NULL_FIELDS).withRedefinedSuperclass().verify();

	}

	public static void main(String[] args) {
		ColoredPoint coloredPoint = new ColoredPoint(1, 1, Color.RED);
		Point point = new Point(1, 1);

		System.out.println("coloredPoint.equals(point):			" + coloredPoint.equals(point));
		System.out.println("point.equals(coloredPoint): 			" + point.equals(coloredPoint));
		System.out.println("coloredPoint.equals((Point) coloredPoint):	" + coloredPoint.equals((Point) coloredPoint));
	}

}
