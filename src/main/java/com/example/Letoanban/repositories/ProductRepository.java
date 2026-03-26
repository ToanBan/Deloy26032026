package com.example.Letoanban.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.Letoanban.entities.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
}

