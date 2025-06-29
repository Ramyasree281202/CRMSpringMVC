package com.java.CRMSpringMVC.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.CRMSpringMVC.model.Customer;
import com.java.CRMSpringMVC.service.ICustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	ICustomerService service;
	
	@GetMapping("/showCus")
	public String showCustomers(Map<String,Object> model) {
		
		List<Customer> cusList = service.getAllCustomers();
		model.put("cusList", cusList);
		return "customerList";
	}
	@GetMapping("/showForm")
	public String registerCustomer(Map<String,Object> model) {
		Customer c=new Customer();
		model.put("customer", c);
		
		
		return "showForm";
	}
	
	@PostMapping("/registerCus")
	public String regCus(Map<String,Object> model,@ModelAttribute("customer")Customer customer) {
		service.registerCustomer(customer);
		return "redirect:/showCus";
	}
	
	@GetMapping("/updateForm")
	public String update(@RequestParam("customerId")Integer id,Map<String,Object> model) {
		Customer cus = service.updateCustomer(id);
		model.put("customer", cus);
		return "updateForm";
	}
	
	@GetMapping("/deleteData")
	public String delete(@RequestParam("customerId")Integer id,Map<String,Object> model) {
		service.deleteCustomer(id);
		return "redirect:/showCus";
	}

}
