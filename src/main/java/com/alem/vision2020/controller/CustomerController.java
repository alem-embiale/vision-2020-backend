package com.alem.vision2020.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alem.vision2020.entity.Customer;
import com.alem.vision2020.services.CustomerService;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@GetMapping("/getCustomers")
	public List<Customer> getCustomers() {
		return customerService.getCustomers();
	}
}
