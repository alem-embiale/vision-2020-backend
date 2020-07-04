package com.alem.vision2020.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="order")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="OrderId")
	private Long id;
	
	private Long orderNo;
	
	@ManyToOne()
	@JoinColumn(name="CustomerId", referencedColumnName="CustomerId", insertable=false, updatable=false)
	private Customer customer;
	
	@Column(name="PMethod")
	private String paymentMethod;
	
	@Column(name="Gtotal")
	private float grandTotal;

	public Order() {
		super();
	}

	public Order(Long id, Long orderNo, Customer customer, String paymentMethod, float grandTotal) {
		super();
		this.id = id;
		this.orderNo = orderNo;
		this.customer = customer;
		this.paymentMethod = paymentMethod;
		this.grandTotal = grandTotal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Long orderNo) {
		this.orderNo = orderNo;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public float getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(float grandTotal) {
		this.grandTotal = grandTotal;
	}
	
	
}
