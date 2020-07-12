package com.alem.vision2020.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
//@Table(name="order_item")
public class OrderItem {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Order_Item_Id")
	private Long orderItemId;
	
	@Column(name="Quantity")
	private int quantity;
	
	@ManyToOne
	@JoinColumn(name="Order_Id")
	private Orders order;
	
	@ManyToOne
	@JoinColumn(name="Item_Id")
	private Item item;

	public OrderItem() {
		super();
	}

	public OrderItem(Long orderItemId, int quantity, Orders order, Item item) {
		super();
		this.orderItemId = orderItemId;
		this.quantity = quantity;
		this.order = order;
		this.item = item;
	}

	@JsonBackReference
	public Item getItem() {
		return item;
	}

	public void setItem() {
		this.item = item;
	}

	@JsonBackReference
	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public Long getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(Long orderItemId) {
		this.orderItemId = orderItemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
