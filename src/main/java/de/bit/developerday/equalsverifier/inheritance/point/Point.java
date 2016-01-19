package de.bit.developerday.equalsverifier.inheritance.point;

import com.google.common.base.MoreObjects;

public class Point {

	private final int x;
	private final int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public boolean equals(Object other) {
		boolean result = false;
		if (other instanceof Point) {
			Point that = (Point) other;
			result = (that.canEqual(this) && this.getX() == that.getX() && this.getY() == that.getY());
		}
		return result;
	}

	@Override
	public int hashCode() {
		return (41 * (41 + getX()) + getY());
	}

	public boolean canEqual(Object other) {
		return (other instanceof Point);
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this.getClass()).add("x", x).add("x", y).toString();
	}
}