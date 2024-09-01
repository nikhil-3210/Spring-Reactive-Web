package com.nikhiljadav.spring_reactive.repository;

import com.nikhiljadav.spring_reactive.entity.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends ReactiveCrudRepository<Product, Long> {
}
