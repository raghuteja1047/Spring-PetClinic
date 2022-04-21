package com.raghu.spring.springpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jt on 7/13/18.
 */
public class Owner extends Person {

	private String telephone;
	private String city;
	private String address;
	private Set<Pet> pets = new HashSet<Pet>();

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<Pet> getPets() {
		return pets;
	}

	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}

}
