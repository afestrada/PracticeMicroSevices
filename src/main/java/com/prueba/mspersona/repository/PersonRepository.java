package com.prueba.mspersona.repository;

import org.springframework.data.repository.CrudRepository;
import com.prueba.mspersona.model.Person;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends CrudRepository <Person, Integer>{


}
