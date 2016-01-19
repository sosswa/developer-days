package de.bit.developerday.equalsverifier.inheritance.car;

import java.time.LocalDate;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class Car {

	final String vin;
	final LocalDate productionDate;
	private String model;
	private int vMax;
	private int seats;

	public Car(String vin, LocalDate productionDate) {
		this.vin = vin;
		this.productionDate = productionDate;
	}

	public String getVin() {
		return vin;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getvMax() {
		return vMax;
	}

	public void setvMax(int vMax) {
		this.vMax = vMax;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Car)) {
			return false;
		}

		if (this == obj) {
			return true;
		}

		final Car rhs = (Car) obj;
		// Simple equals method that only uses one final field.
		return Objects.equal(this.vin, rhs.vin);
	}

	@Override
	public int hashCode() {

		// Simple hashCode method that only uses one final field.
		return Objects.hashCode(vin);
	}

	@Override
	public String toString() {
		// Simple equals method that only uses one final field.
		return MoreObjects.toStringHelper(this).add("vin", vin).toString();
	}

}
