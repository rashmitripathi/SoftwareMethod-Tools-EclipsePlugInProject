package edu.umkc.rashmi.asteroid.utilInterfaces;

public interface IClock {
	
	
	public default void setCyclesPerSecond(float cyclesPerSecond) {}
	
	/**
	 * Resets the clock stats. Elapsed cycles and cycle excess will be reset
	 * to 0, the last update time will be reset to the current time, and the
	 * paused flag will be set to false.
	 */
	public default void reset() {}
	
	/**
	 * Updates the clock stats. The number of elapsed cycles, as well as the
	 * cycle excess will be calculated only if the clock is not paused. This
	 * method should be called every frame even when paused to prevent any
	 * nasty surprises with the delta time.
	 */
	public default void update() {}
	
	/**
	 * Pauses or unpauses the clock. While paused, a clock will not update
	 * elapsed cycles or cycle excess, though the {@code update} method should
	 * still be called every frame to prevent issues.
	 * @param paused Whether or not to pause this clock.
	 */
	public default void setPaused(boolean paused) {}
}
