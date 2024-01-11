package de.unistuttgart.iste.sqa.pse.sheet12.presence.stables;

/**
 * This class represents a cage in which a defined number of laying poultries can live.
 *
 * @version 1.0
 */
public class Cage<T extends LayingPoultry> {
	public int id;
	private final int height;
	private final double width;
	private final int capacity;
	private final boolean isFull;
	
	public Cage(final int id, final int height, final double width, final int capacity, final boolean isFull) {
		super();
		this.id = id;
		this.height = height;
		this.width = width;
		this.capacity = capacity;
		this.isFull = isFull;
	}
}
