package com.java.CRMSpringMVC.service;

import java.util.List;

import com.java.CRMSpringMVC.model.Customer;

public interface ICustomerService {
	public void registerCustomer(Customer cus);
	public List<Customer> getAllCustomers();
	public Customer updateCustomer(Integer id);
	public void deleteCustomer(Integer id);
}
