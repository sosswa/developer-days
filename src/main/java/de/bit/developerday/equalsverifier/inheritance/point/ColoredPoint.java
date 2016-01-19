package de.bit.developerday.equalsverifier.inheritance.point;

import com.google.common.base.MoreObjects;

public class ColoredPoint extends Point { // No longer violates symmetry
											// requirement

	private final Color color;

	public ColoredPoint(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	@Override
	public final boolean equals(Object other) {
		boolean result = false;
		if (other instanceof ColoredPoint) {
			ColoredPoint that = (ColoredPoint) other;
			result = (that.canEqual(this) && this.color.equals(that.color) && super.equals(that));
		}
		return result;
	}

	@Override
	public final int hashCode() {
		return (41 * super.hashCode() + color.hashCode());
	}

	@Override
	public final boolean canEqual(Object other) {
		return (other instanceof ColoredPoint);
	}

	@Override
	public String toString() {
		return super.toString() + MoreObjects.toStringHelper(this.getClass()).add("color", color);
	}
}