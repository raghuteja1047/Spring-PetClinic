package com.raghu.spring.springpetclinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by jt on 7/13/18.
 */

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vets")
public class Vet extends Person {
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "vets_specialities", joinColumns = @JoinColumn(name = "vet_id"), inverseJoinColumns = @JoinColumn(name = "speciality_id"))
	Set<Speciality> specialities = new HashSet<Speciality>();

}
