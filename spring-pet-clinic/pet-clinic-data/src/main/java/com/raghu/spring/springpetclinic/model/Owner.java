package com.raghu.spring.springpetclinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by jt on 7/13/18.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "owners")
public class Owner extends Person {

	
	@Column(name = "telephone")
	private String telephone;
	@Column(name = "city")
	private String city;
	
	@Column(name = "address")
	private String address;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
	private Set<Pet> pets = new HashSet<Pet>();
	@Builder
	public Owner(Long id, String firstName, String lastName, String telephone, String city, String address,
			Set<Pet> pets) {
		super(id, firstName, lastName);
		this.telephone = telephone;
		this.city = city;
		this.address = address;
		this.pets = pets;
	}


 
	
}
