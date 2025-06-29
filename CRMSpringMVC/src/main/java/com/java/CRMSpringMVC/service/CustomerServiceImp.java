package com.java.CRMSpringMVC.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.CRMSpringMVC.dao.ICustomerRepo;
import com.java.CRMSpringMVC.model.Customer;
@Service
public class CustomerServiceImp implements ICustomerService {
	
	@Autowired
	ICustomerRepo repo;
	
	@Override
	public void registerCustomer(Customer cus) {
		repo.save(cus);
		
	}

	@Override
	public List<Customer> getAllCustomers() {
	List<Customer> cuslist =	(List<Customer>) repo.findAll();
		return cuslist;
	}

	@Override
	public Customer updateCustomer(Integer id) {
	   Optional<Customer> cus =  repo.findById(id);
		return cus.get();
	}

	@Override
	public void deleteCustomer(Integer id) {
		repo.deleteById(id);

	}

}
