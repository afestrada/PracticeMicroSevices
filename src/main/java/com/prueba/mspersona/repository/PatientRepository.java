package com.prueba.mspersona.repository;

import com.prueba.mspersona.model.Patient;
import com.prueba.mspersona.model.PatientPk;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientRepository extends CrudRepository <Patient, PatientPk>{


}
