package de.unistuttgart.iste.sqa.pse.sheet12.presence.stables;

/**
 * This class represents a veterinary who cares for the laying poultries on a regular basis
 * and specifically when one laying poultry is ill.
 *
 * @version 1.0
 */
public class Veterinary {
	private int id;
	private String firstName;
	private String lastName;
	private String phone;

	protected void careForAllPoultries() {}

	private void careFor(LayingPoultry illLayingPoultry) {}
}
