package de.bit.developerday.equalsverifier.mistakes.signature;

import java.time.LocalDate;

import com.google.common.base.Objects;

public class SignatureCar {

	final String vin;
	final LocalDate productionDate;

	public SignatureCar(String vin, LocalDate productionDate) {
		this.vin = vin;
		this.productionDate = productionDate;
	}

	public String getVin() {
		return vin;
	}

	public LocalDate getProductionDate() {
		return productionDate;
	}

	// Wrong signature for equals message. Parameter should be of type Object
	public boolean equals(SignatureCar obj) {
		return Objects.equal(this.vin, obj.vin) && Objects.equal(this.productionDate, obj.productionDate);
	}

	public int hashCode() {
		return Objects.hashCode(vin, productionDate);
	}

}
