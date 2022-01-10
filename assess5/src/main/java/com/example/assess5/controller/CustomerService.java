package com.example.assess5.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.assess5.model.Customers;
import com.example.assess5.repository.CusomerRepository;

//import com.example.assess.model.Employee;
//import com.example.assess.repository.EmployeeRepository;

public class CustomerService {
	@Autowired
	private CusomerRepository customerRepository;
	
	@GetMapping("/customer")
	public ArrayList getAllCustomer(){
		
		return (ArrayList) customerRepository.findAll();
	}
	
	@PostMapping("/employee")
	public Customers createCustomer(@RequestBody Customers customer) {
		
		return customerRepository.save(customer);
		
	}

}
