package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
//service is tussenlaag tussen mij een de controler

@Service
@Primary
public class ProductService {
// autowired
    @Autowired
    private ProductRepository repo;

@Query("SELECT p FROM Product p WHERE p.productName = ?1")
public Product findByName(String productName) {
    return repo.findByName(productName);
}

//geen void, want heeft een return type.
    public List<Product> findAll() {
        return repo.findAll();
    }
//    List<Product> productList = service.findAll();

    public List<Product> findAllById(Iterable<Integer> iterable) {
        return repo.findAllById(iterable);
    }

    public Optional<Product> findProduct(Integer id) {
    return repo.findById(id);
    }

    public Product createNewBoek(Product newProductData) {
    return repo.save(newProductData);
    }

    public void deleteById(Integer id) {

        repo.deleteById(id);
    }



//    @Query("SELECT p FROM Product p WHERE p.")

//    /**
//     * @return
//     */
//    public List<Product> findById() {
//        return repo.findById(2);
//    }


}


