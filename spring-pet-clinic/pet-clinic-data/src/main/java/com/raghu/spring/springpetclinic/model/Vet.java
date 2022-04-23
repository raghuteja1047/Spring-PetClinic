package com.raghu.spring.springpetclinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Created by jt on 7/13/18.
 */
@Entity
@Table(name = "vets")
public class Vet extends Person {
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "vets_specialities", joinColumns = @JoinColumn(name = "vet_id"), inverseJoinColumns = @JoinColumn(name = "speciality_id"))
	Set<Speciality> specialities = new HashSet<Speciality>();

	public Set<Speciality> getSpecialities() {
		return specialities;
	}

	public void setSpecialities(Set<Speciality> specialities) {
		this.specialities = specialities;
	}

}
