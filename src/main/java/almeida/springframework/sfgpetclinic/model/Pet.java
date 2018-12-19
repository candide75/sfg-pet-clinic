package almeida.springframework.sfgpetclinic.model;

import java.util.Date;
import java.util.Set;

public class Pet {

	private final Date			birthDate;

	private final PetType		type;

	private final Owner			owner;

	private final Set<Visit>	visits;

	public Pet(Date birthDate, PetType type, Owner owner, Set<Visit> visits) {
		this.birthDate = birthDate;
		this.type = type;
		this.owner = owner;
		this.visits = visits;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public PetType getType() {
		return this.type;
	}

	public Owner getOwner() {
		return this.owner;
	}

	public Set<Visit> getVisits() {
		return this.visits;
	}
}
