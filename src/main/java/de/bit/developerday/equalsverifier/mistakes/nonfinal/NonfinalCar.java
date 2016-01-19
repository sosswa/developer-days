package de.bit.developerday.equalsverifier.mistakes.nonfinal;

import java.time.LocalDate;

import com.google.common.base.Objects;

public class NonfinalCar {

	// Non final fields
	private String vin;
	private LocalDate productionDate;

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public LocalDate getProductionDate() {
		return productionDate;
	}

	public void setProductionDate(LocalDate productionDate) {
		this.productionDate = productionDate;
	}

	@Override
	// Non final equals message
	public boolean equals(Object obj) {
		if (!(obj instanceof NonfinalCar)) {
			return false;
		}

		NonfinalCar rhs = (NonfinalCar) obj;

		if (rhs == this) {
			return true;
		}

		return Objects.equal(this.vin, rhs.vin) && Objects.equal(this.productionDate, rhs.productionDate);
	}

	@Override
	// Non final equals message
	public int hashCode() {
		return Objects.hashCode(vin, productionDate);
	}

}
