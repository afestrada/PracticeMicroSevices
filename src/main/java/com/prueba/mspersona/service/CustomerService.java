package com.prueba.mspersona.service;

import com.prueba.mspersona.model.Customer;
import com.prueba.mspersona.model.CustomerPk;
import com.prueba.mspersona.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer findById(CustomerPk cpk) {
        return customerRepository.findById(cpk).orElse(null);
    }
}
