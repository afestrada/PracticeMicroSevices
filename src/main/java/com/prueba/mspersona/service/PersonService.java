package com.prueba.mspersona.service;

import com.prueba.mspersona.model.Person;
import com.prueba.mspersona.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService implements IPerson {

 @Autowired
    private PersonRepository personaRepository;

 @Override
 public Person findById(Integer id) {
     return personaRepository.findById(id).orElse(null);
    }
}
