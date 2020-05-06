package com.prueba.mspersona.repository;

import com.prueba.mspersona.model.Customer;
import com.prueba.mspersona.model.CustomerPk;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository <Customer, CustomerPk>{
}
