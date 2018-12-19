package almeida.springframework.sfgpetclinic.model;

import java.util.Date;

public class Visit {

	private final Date		date;

	private final String	description;

	private final Pet		pet;

	public Visit(Date date, String description, Pet pet) {
		this.date = date;
		this.description = description;
		this.pet = pet;
	}

	public Date getDate() {
		return this.date;
	}

	public String getDescription() {
		return this.description;
	}

	public Pet getPet() {
		return this.pet;
	}
}
