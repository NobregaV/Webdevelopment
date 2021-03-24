package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class ProductService {
    @Autowired
    private ProductRepository repo;
@Query("SELECT p FROM Product p WHERE p.productName = ?1")
public Product findByName(String productName) {
    return repo.findByName(productName);
}
    public List<Product> findAll() {
        return repo.findAll();
    }
//    List<Product> productList = service.findAll();

    public List<Product> findAllById(Iterable<Integer> iterable) {
        return repo.findAllById(iterable);
    }

//    @Query("SELECT p FROM Product p WHERE p.")

//    /**
//     * @return
//     */
//    public List<Product> findById() {
//        return repo.findById(2);
//    }


}


