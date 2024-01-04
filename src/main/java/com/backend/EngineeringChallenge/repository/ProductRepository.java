package com.backend.EngineeringChallenge.repository;

import com.backend.EngineeringChallenge.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
