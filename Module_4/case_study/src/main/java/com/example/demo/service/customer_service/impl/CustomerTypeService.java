package com.example.demo.service.customer_service.impl;

import com.example.demo.model.person.customer.CustomerType;
import com.example.demo.reponsitory.customer_reponsitory.ICustomerTypeReponsitory;
import com.example.demo.service.customer_service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerTypeService implements ICustomerTypeService {
    @Autowired
    private ICustomerTypeReponsitory iCustomerTypeReponsitory;
    public List<CustomerType> findAll(){
        return iCustomerTypeReponsitory.findAll();
    }
}
