package de.unistuttgart.iste.sqa.pse.sheet12.presence.stables;

/**
 * This class represents a cage in which a defined number of laying poultries can live.
 *
 * @version 1.0
 */
public class Cage<T extends LayingPoultry> {
	public int id;
	private int height;
	private double width;
	private int capacity;
	private boolean isFull;
}
