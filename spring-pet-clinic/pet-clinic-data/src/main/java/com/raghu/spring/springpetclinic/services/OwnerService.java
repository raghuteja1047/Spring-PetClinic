package com.raghu.spring.springpetclinic.services;

import com.raghu.spring.springpetclinic.model.Owner;

public interface OwnerService extends CurdService<Owner, Long> {

	Owner findByLastName(String lname);
}
