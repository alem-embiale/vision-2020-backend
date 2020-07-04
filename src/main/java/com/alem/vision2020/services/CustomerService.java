package com.alem.vision2020.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alem.vision2020.entity.Customer;
import com.alem.vision2020.repository.iCustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private iCustomerRepository customerRepository;

	public List<Customer> getCustomers() {
		List<Customer> list = new ArrayList<>();
		list = customerRepository.findAll();
		return list;
	}
}
