package com.prueba.mspersona.service;

import com.prueba.mspersona.model.Patient;
import com.prueba.mspersona.model.PatientPk;
import com.prueba.mspersona.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService implements IPatient {

 @Autowired
    private PatientRepository patientRepository;

    @Override
    public Patient findById(PatientPk pk) {
        return patientRepository.findById(pk).orElse(null);

    }
}
