package com.example.nimap_infotech_task.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.nimap_infotech_task.entity.Product;

public interface ProductService {
	
	 public Page<Product> getAllProducts(Pageable pageable);
	 
	 public Product createProduct(Product product);
	 
	 public Optional<Product> getProductById(Long id);
	 
	 public Product updateProduct(Long id, Product product);
	 
	 public void deleteProduct(Long id);

}
