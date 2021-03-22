package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

@Controller
public class Webshop {

@Autowired
    ProductService service;

@GetMapping("")
    public String viewHomePage() {
    return "homepage";
}
@GetMapping("/book1")
    public String ProductDescreption() {
    return "book1";

}

@GetMapping("/api/boeken")
    public ResponseEntity allBooks(HttpServletRequest request) {
    try {
        List<Product> productData = service.findAll();
        return new ResponseEntity<>(productData, HttpStatus.OK);
    }
catch (Exception e) {
        return new ResponseEntity<>("Het is niet gelukt", HttpStatus.INTERNAL_SERVER_ERROR);

}
}

////@RequestMapping("")
//@PostMapping(value = "")
//public String addBook (){
//
//{





}



