package com.alem.vision2020.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alem.vision2020.entity.Product;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

	@GetMapping("/getProduct")
	public Product getProduct() {
		return new Product(1L, "ddd", "ccc", "eee", "ttt", 52.30F);
	}
}
