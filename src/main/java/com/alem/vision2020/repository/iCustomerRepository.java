package com.alem.vision2020.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alem.vision2020.entity.Customer;

@Repository
public interface iCustomerRepository extends JpaRepository<Customer, Long> {

}
