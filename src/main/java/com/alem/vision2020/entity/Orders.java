package com.alem.vision2020.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.List;

import javax.persistence.*;

@Entity
//@Table(name="order")
public class Orders {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Order_Id")
	private Long orderId;
	
	@Column(name="Order_No")
	private String orderNo;
	
	@Column(name="Payment_Method")
	private String paymentMethod;
	
	@Column(name="Grand_Total")
	private float grandTotal;
	
	@ManyToOne
	@JoinColumn(name="Customer_Id")
	private Customer customer;
	
	@OneToMany(mappedBy = "order")
	private List<OrderItem> orderItems;

	public Orders() {
		super();
	}

	public Orders(Long orderId, String orderNo, String paymentMethod, float grandTotal, Customer customer, List<OrderItem> orderItems) {
		super();
		this.orderId = orderId;
		this.orderNo = orderNo;
		this.paymentMethod = paymentMethod;
		this.grandTotal = grandTotal;
		this.customer = customer;
		this.orderItems = orderItems;
	}
	@JsonManagedReference
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems() {
		this.orderItems = orderItems;
	}

	@JsonBackReference
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
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
