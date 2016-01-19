package de.bit.developerday.equalsverifier.simple;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class CarTest {

	private Car car;
	private Car equalCar;
	private Car nonEqualCar;

	@Before
	public void setUp() {

		// 1. Creating some equal and not equal car objects
		car = new Car("WDDGF8BB4AF382449", LocalDate.of(2010, 04, 25));
		equalCar = new Car("WDDGF8BB4AF382449", LocalDate.of(2010, 04, 25));
		nonEqualCar = new Car("WDBHA28E5VF557288", LocalDate.of(2011, 05, 22));

	}

	@Test
	public void testEqual() {

		// 2. Test that equal cars are equal
		boolean equals = car.equals(equalCar);

		assertThat(equals, is(true));
	}

	@Test
	public void testNonEqual() {

		// 3. Test that non equal cars are not equal
		boolean equals = car.equals(nonEqualCar);

		assertThat(equals, is(false));
	}

	@Test
	public void testEqualHashCode() {
		// 4. Test that equal cars have the same hash code

		int hash1 = car.hashCode();
		int hash2 = equalCar.hashCode();

		assertThat(hash1, equalTo(hash2));
	}

	@Test
	public void testNonEqualHashCode() {

		// 4. Test that non equal cars have not the same hash code
		// This is wrong! Non equal objects are allowed to have the same hash
		// code!
		int hash1 = car.hashCode();
		int hash2 = nonEqualCar.hashCode();

		assertThat(hash1, not(equalTo(hash2)));
	}
}
