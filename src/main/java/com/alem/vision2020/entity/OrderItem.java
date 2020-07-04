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
@Table(name ="orderitems")
public class OrderItem {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="OrderItemId")
	private Long id;
	
	@ManyToOne()
	@JoinColumn(name="OrderId", referencedColumnName="OrderId", insertable=false, updatable=false)
	private Order order;
	
	@ManyToOne()
	@JoinColumn(name="ItemId", referencedColumnName="OrderId", insertable=false, updatable=false)
	private Item item;
	
	@Column(name="Quantity")
	private int quantity;
	
	public OrderItem() {
		super();
	}

	public OrderItem(Long id, Order order, Item item, int quantity) {
		super();
		this.id = id;
		this.order = order;
		this.item = item;
		this.quantity = quantity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
