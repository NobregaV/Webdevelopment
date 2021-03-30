package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;


import static com.example.demo.repository.ProductRepository.*;

@RequestMapping
@Controller
public class Webshop {

    @Autowired
    ProductService service;

//
    @GetMapping("")
    public String homePage() {
        return "homepage";
    }


    @GetMapping("/api/boeken/{id}")
    public ResponseEntity ProductDescreption(@PathVariable Integer id, HttpServletRequest request) {
        try {
            Optional<Product> bookDetail = service.findProduct(id);
            return new ResponseEntity<>(bookDetail, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>("Het is niet gelukt", HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }

    @GetMapping("/api/boeken")
    public ResponseEntity allBooks(HttpServletRequest request) {
        try {
            List<Product> productData = service.findAll();
            return new ResponseEntity<>(productData, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Het is niet gelukt", HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }
//putmapping voor create id
    @PutMapping("/api/boeken")
    public ResponseEntity updateBoeken(@RequestBody Product newProductData) {

        try {
            service.createNewBoek(newProductData);

            return new ResponseEntity(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity("Niet gelukt", HttpStatus.INTERNAL_SERVER_ERROR);
        }
//
    }

//
//putmapping om te updaten
@PutMapping("/api/boeken/{id}")
//in mijn parameters staat de info die ik terug moet zien in de codeblock.
public ResponseEntity boekAanpassen(@RequestBody Product updateBoek, @PathVariable Integer id) {

        try {
//            service.findProduct(id);
            service.createNewBoek(updateBoek);
            return new ResponseEntity(updateBoek, HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity("ERROR!!", HttpStatus.INTERNAL_SERVER_ERROR);
        }
}



    @DeleteMapping("/api/boeken/{id}")
    public ResponseEntity UpdateData(@PathVariable Integer id, HttpServletRequest request) {
        try {
            service.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>("Het is niet gelukt", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    
}






















