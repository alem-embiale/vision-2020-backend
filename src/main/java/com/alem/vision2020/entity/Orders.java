package com.alem.vision2020.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="order")
public class Orders {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_Order")
	private Long orderId;
	
	@Column(name="OrderNo")
	private String orderNo;
	
	@Column(name="PMethod")
	private String paymentMethod;
	
	@Column(name="GTotal")
	private float grandTotal;
	
	@ManyToOne
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
	
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	
	public void setOrderItems() {
		this.orderItems = orderItems;
	}
	
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
