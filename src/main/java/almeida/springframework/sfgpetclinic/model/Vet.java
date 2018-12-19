package almeida.springframework.sfgpetclinic.model;

import java.util.Set;

public class Vet extends Person {

	private final Set<Speciality> specialities;

	public Vet(String firstName, String lastName, Set<Speciality> specialities) {
		super(firstName, lastName);
		this.specialities = specialities;
	}

	public Set<Speciality> getSpecialities() {
		return this.specialities;
	}
}
