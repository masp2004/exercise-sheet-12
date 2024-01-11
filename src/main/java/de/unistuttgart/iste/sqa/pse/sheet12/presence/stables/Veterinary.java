package de.unistuttgart.iste.sqa.pse.sheet12.presence.stables;

/**
 * This class represents a veterinary who cares for the laying poultries on a regular basis
 * and specifically when one laying poultry is ill.
 *
 * @version 1.0
 */
public class Veterinary {
	private final int id;
	private final String firstName;
	private final String lastName;
	private final String phone;
	
	public Veterinary(int id, String firstName, String lastName, String phone) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}
	
	protected void careForAllPoultries() {}

	private void careFor(final LayingPoultry illLayingPoultry) {}
}
