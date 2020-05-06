package com.prueba.mspersona.service;

import com.prueba.mspersona.model.Patient;
import com.prueba.mspersona.model.PatientPk;


public interface IPatient {


    Patient findById(PatientPk pk);

}
