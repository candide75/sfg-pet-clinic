package almeida.springframework.sfgpetclinic.model;

import java.util.Set;

public class Owner extends Person {

	private final String	address;

	private final String	city;

	private final String	telephone;

	private final Set<Pet>	pets;

	public Owner(String firstName, String lastName, String address, String city, String telephone, Set<Pet> pets) {
		super(firstName, lastName);
		this.address = address;
		this.city = city;
		this.telephone = telephone;
		this.pets = pets;
	}

	public String getAddress() {
		return this.address;
	}

	public String getCity() {
		return this.city;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public Set<Pet> getPets() {
		return this.pets;
	}
}
