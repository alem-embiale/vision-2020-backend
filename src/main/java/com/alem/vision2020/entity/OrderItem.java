package com.alem.vision2020.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orderitems")
public class OrderItem {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_Orderitems")
	private Long orderItemId;
	
	@Column(name="Quantity")
	private int quantity;
	
	@ManyToOne
	private Orders order;
	
	@ManyToOne
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
	
	public Item getItem() {
		return item;
	}
	
	public void setItem() {
		this.item = item;
	}
	
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
