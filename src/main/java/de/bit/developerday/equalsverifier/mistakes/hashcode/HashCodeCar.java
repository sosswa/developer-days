package de.bit.developerday.equalsverifier.mistakes.hashcode;

import java.time.LocalDate;

import com.google.common.base.Objects;

public class HashCodeCar {

	final String vin;
	final LocalDate productionDate;

	public HashCodeCar(String vin, LocalDate productionDate) {
		this.vin = vin;
		this.productionDate = productionDate;
	}

	public String getVin() {
		return vin;
	}

	public LocalDate getProductionDate() {
		return productionDate;
	}

	@Override
	public final boolean equals(Object obj) {

		if (!(obj instanceof HashCodeCar)) {
			return false;
		}

		HashCodeCar rhs = (HashCodeCar) obj;

		if (rhs == this) {
			return true;
		}

		return Objects.equal(this.vin, rhs.vin) && Objects.equal(this.productionDate, rhs.productionDate);
	}

	@Override
	public final int hashCode() {
		// hashCode does not depend on the field productionDate.
		return Objects.hashCode(vin);
	}

}
