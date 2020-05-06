package com.prueba.mspersona.service;

import com.prueba.mspersona.model.Customer;
import com.prueba.mspersona.model.CustomerPk;

public interface ICustomer {
    Customer findById(CustomerPk cpk);
}
