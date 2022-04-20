package com.raghu.spring.springpetclinic.model;

import java.util.Set;

/**
 * Created by jt on 7/13/18.
 */
public class Vet extends Person {
	
	Set<Speciality> specialities;

	public Set<Speciality> getSpecialities() {
		return specialities;
	}

	public void setSpecialities(Set<Speciality> specialities) {
		this.specialities = specialities;
	}


}
