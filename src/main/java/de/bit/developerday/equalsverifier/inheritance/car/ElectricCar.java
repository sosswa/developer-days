package de.bit.developerday.equalsverifier.inheritance.car;

import java.time.LocalDate;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class ElectricCar extends Car {

	private final int kwh;

	public ElectricCar(String vin, LocalDate productionDate, int kwh) {
		super(vin, productionDate);
		this.kwh = kwh;
	}

	@Override
	public final boolean equals(Object obj) {
		if (!(obj instanceof ElectricCar)) {
			return false;
		}

		ElectricCar rhs = (ElectricCar) obj;

		if (rhs == this) {
			return true;
		}

		return Objects.equal(this.kwh, rhs.kwh) && super.equals(obj);

	}

	@Override
	public final int hashCode() {
		return super.hashCode();
	}

	@Override
	public String toString() {
		return super.toString() + MoreObjects.toStringHelper(this).add("kw/h", kwh).toString();
	}

}
