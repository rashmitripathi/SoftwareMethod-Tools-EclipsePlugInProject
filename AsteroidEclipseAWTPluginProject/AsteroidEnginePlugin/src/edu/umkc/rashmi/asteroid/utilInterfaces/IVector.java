package edu.umkc.rashmi.asteroid.utilInterfaces;

public interface IVector {

	
	/**
	 * Creates a new Vector from an angle. The length of this vector will be 1.
	 * @param angle The angle.
	 */
	public default void Vector2(double angle) {}
	
	/**
	 * Creates a new Vector with the desired values.
	 * @param x The x value.
	 * @param y The y value.
	 */
	public default void Vector2(double x, double y) {}


}
