package com.java.CRMSpringMVC.dao;

import org.springframework.data.repository.CrudRepository;

import com.java.CRMSpringMVC.model.Customer;

public interface ICustomerRepo extends CrudRepository<Customer,Integer>{

}
