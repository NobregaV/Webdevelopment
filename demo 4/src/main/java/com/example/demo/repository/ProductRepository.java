package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

@Query("SELECT p FROM Product p WHERE p.productName = ?1")
Product findByName(String productName);



//    Optional<Product> deleteById(Product deleteBook);

//    Optional<Product> delete();


//    Optional<Product> findById();
}
