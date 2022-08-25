package com.alex.everything_under_the_sun.repositories;

import com.alex.everything_under_the_sun.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}