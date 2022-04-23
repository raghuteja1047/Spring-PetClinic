package com.raghu.spring.springpetclinic.repo;

import org.hibernate.hql.internal.ast.util.NodeTraverser.VisitationStrategy;
import org.springframework.data.repository.CrudRepository;

import com.raghu.spring.springpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long>{

}
