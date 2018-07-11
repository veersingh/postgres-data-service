package com.nec.product.repositories;

import org.springframework.data.repository.CrudRepository;

import com.nec.product.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

	
	
}
