package de.unistuttgart.iste.sqa.pse.sheet12.presence.stables;

/**
 * This class represents a laying poultry which can be bred in the stable.
 *
 * @version 1.0
 */
public class LayingPoultry {
	private final int id;
	private final String type;
	private final double age;
	private final double weight;
	
	public LayingPoultry(final int id, final String type, final double age, final double weight) {
		super();
		this.id = id;
		this.type = type;
		this.age = age;
		this.weight = weight;
	}
}
