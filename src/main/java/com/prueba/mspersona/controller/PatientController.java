package com.prueba.mspersona.controller;

import com.prueba.mspersona.model.Patient;
import com.prueba.mspersona.model.PatientPk;
import com.prueba.mspersona.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @Autowired
    private PatientService pacientesService;

    @GetMapping("/patient")
    public Patient findPatientById(@RequestParam String documentType, @RequestParam String documentNumber) {
        return pacientesService.findById(new PatientPk(documentType,documentNumber));
    }
}

