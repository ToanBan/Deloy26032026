package com.example.Letoanban.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Letoanban.entities.Product;
import com.example.Letoanban.repositories.ProductRepository;

@Service
public class ProductService {

	private final ProductRepository productRepository;

	@Autowired
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public List<Product> getAll() {
		return productRepository.findAll();
	}

	public Optional<Product> getById(String id) {
		return productRepository.findById(id);
	}

	public Product create(Product product) {
		return productRepository.save(product);
	}

	public Product update(String id, Product product) {
		product.setId(id);
		return productRepository.save(product);
	}

	public void delete(String id) {
		productRepository.deleteById(id);
	}
}
