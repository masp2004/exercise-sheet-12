package de.unistuttgart.iste.sqa.pse.sheet12.presence.stables;

/**
 * This class represents a technician who requests maintenance for the stable.
 *
 * @version 1.0
 */
public class Technician {
	private final int id;
	private final String firstName;
	private final String lastName;
	private final String phone;
	
	public Technician(final int id, final String firstName, final String lastName, final String phone) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}

	protected void maintenanceRequest(final Stable stable) {}
}
