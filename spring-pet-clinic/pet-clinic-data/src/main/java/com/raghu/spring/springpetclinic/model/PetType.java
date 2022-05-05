package com.raghu.spring.springpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
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
 
 @Table(name = "types")
public class PetType extends BaseEntity {

	 @Column(name = "name")
    private String name;

	@Override
	public String toString() {
		return name;
	}
	 
	 
}
