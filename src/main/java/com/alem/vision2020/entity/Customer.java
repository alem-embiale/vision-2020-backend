package com.alem.vision2020.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Customer_Id")
	private Long customerId;
	
	@Column(name="Customer_Name")
	private String name;
	
	@OneToMany(mappedBy = "customer")
	private List<Orders> orders;

	public Customer() {
		super();
	}

	public Customer(Long customerId, String name, List<Orders> orders) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.orders = orders;
	}

	@JsonManagedReference
	public List<Orders> getOrders() {
		return orders;
	}
	
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
