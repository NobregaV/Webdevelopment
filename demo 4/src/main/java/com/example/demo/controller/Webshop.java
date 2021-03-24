package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Controller
public class Webshop {

    @Autowired
    ProductService service;

    @GetMapping("")
    public String viewHomePage(Model model) {
//        List<Product> productList = service.findAll();
        List<Product> productData = service.findAll();
//        model.addAttribute("productList", productList);
        model.addAttribute("productData", productData);
        int leftLimit = 97;
        int rightLimit = 122;
        int targetStringLength = 20;
        Random random = new Random();
        StringBuffer buffer = new StringBuffer(targetStringLength);

        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);

        }

        String generatedString = buffer.toString();
        model.addAttribute(generatedString);

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
        } catch (Exception e) {
            return new ResponseEntity<>("Het is niet gelukt", HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }
}

//        @GetMapping("{/id}")
//                public String viewProductDetailsPage(@PathVariable("id")Integer id, Model model) {
//            List<Product> productOne = service.findById();
//            String specs = product.get().getProductDesription();
//            model.addAttricute("product", product.get()));
//model.addAttribute("specs", specs);







//


//    @GetMapping("/api/id")
//    public ResponseEntity boek(HttpServletRequest request) {
//        try {
//            List<Product> productData = service.findById(2);
//            return new ResponseEntity<>(productData, HttpStatus.OK);
//
//            catch (Exception) {
//            return new ResponseEntity<>("Het is niet gelukt", HttpStatus.INTERNAL_SERVER_ERROR);
//            }
//
//        }
//    }

////@RequestMapping("")
//@PostMapping(value = "")
//public String addBook (){
//
//{









