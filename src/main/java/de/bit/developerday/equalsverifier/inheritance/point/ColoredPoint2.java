package de.bit.developerday.equalsverifier.inheritance.point;

import com.google.common.base.MoreObjects;

public class ColoredPoint2 extends Point { // No longer violates symmetry
											// requirement

	private final Color color;

	public ColoredPoint2(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	@Override
	public final boolean equals(Object other) {
		boolean result = false;
		if (other instanceof ColoredPoint2) {
			ColoredPoint2 that = (ColoredPoint2) other;
			result = (this.color.equals(that.color) && super.equals(that));
		}
		return result;
	}

	@Override
	public final int hashCode() {
		return (41 * super.hashCode() + color.hashCode());
	}

	@Override
	public String toString() {
		return super.toString() + MoreObjects.toStringHelper(this.getClass()).add("color", color);
	}
}