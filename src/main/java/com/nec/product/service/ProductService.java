package com.nec.product.service;

import com.nec.product.entities.Product;

public interface ProductService {

	Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);
    
}
