package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class ProductService {
    @Autowired
    private ProductRepository repo;

    public List<Product> findAll() {
        return repo.findAll();
    }

//    /**
//     * @return
//     */
//    public List<Product> findById() {
//        return repo.findById(2);
//    }


}


