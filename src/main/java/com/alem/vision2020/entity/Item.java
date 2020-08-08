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
@Table(name="item")
public class Item {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Item_Id")
	private Long itemId;
	
	@Column(name="Item_Name")
	private String name;
	
	@Column(name="Price")
	private double price;
	
	@OneToMany(mappedBy = "item")
	private List<OrderItem> orderItems;

	public Item() {
		super();
	}

	public Item(Long itemId, String name, double price, List<OrderItem> orderItems) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.price = price;
		this.orderItems = orderItems;
	}

	@JsonManagedReference
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	
	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
