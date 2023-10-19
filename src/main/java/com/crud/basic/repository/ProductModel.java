package com.crud.basic.repository;

import com.crud.basic.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductModel extends JpaRepository<Product, Long> {
}
