package com.alem.vision2020.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alem.vision2020.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
