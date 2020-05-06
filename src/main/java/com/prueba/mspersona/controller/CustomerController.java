package com.prueba.mspersona.controller;

import com.prueba.mspersona.model.Customer;
import com.prueba.mspersona.model.CustomerPk;
import com.prueba.mspersona.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer")
    public Customer findCustomerById(@RequestParam String documentType, @RequestParam String documentNumber) {
        return customerService.findById(new CustomerPk(documentType,documentNumber));
    }
}

