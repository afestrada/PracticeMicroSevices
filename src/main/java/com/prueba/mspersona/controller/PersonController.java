package com.prueba.mspersona.controller;

import com.prueba.mspersona.model.Person;
import com.prueba.mspersona.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonService personaService;

    @GetMapping("/person")
    public Person findPersonById(@RequestParam int id) {
       return personaService.findById(id);
    }
}

