package de.unistuttgart.iste.sqa.pse.sheet12.presence.stables;

import java.util.Date;

/**
 * This class represents a ventilator which should be opened independent of the
 * current temperature.
 *
 * @version 1.0
 */
public class Ventilator {
	private final int id;
	private final int width;
	private final int height;
	private boolean on;
	private final Date purchaseDate;
	private final int powerClimatisation;

	public Ventilator(final int id, final int width, final int height, final boolean on, final Date purchaseDate,
			final int powerClimatisation) {
		super();
		this.id = id;
		this.width = width;
		this.height = height;
		this.on = on;
		this.purchaseDate = purchaseDate;
		this.powerClimatisation = powerClimatisation;
	}

	protected void turnOn() {
		this.on = true;
	}

	protected void turnOff() {
		this.on = false;
	}

	protected boolean isOn() {
		return this.on;
	}
}
