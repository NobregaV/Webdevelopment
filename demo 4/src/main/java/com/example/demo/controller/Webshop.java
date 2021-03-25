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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@RequestMapping
@Controller
public class Webshop {

    @Autowired
    ProductService service;

//    @GetMapping("")
//    public String boeken (Model model) {
////        List<Product> productList = service.findAll();
//        List<Product> productData = service.findAll();
////        model.addAttribute("productList", productList);
//        model.addAttribute("productData", productData);
//        int leftLimit = 97;
//        int rightLimit = 122;
//        int targetStringLength = 20;
//        Random random = new Random();
//        StringBuilder buffer = new StringBuilder(targetStringLength);
//
//        for (int i = 0; i < targetStringLength; i++) {
//            int randomLimitedInt = leftLimit + (int)
//                    (random.nextFloat() * (rightLimit - leftLimit + 1));
//            buffer.append((char) randomLimitedInt);
//
//        }
//
//        String generatedString = buffer.toString();
//        model.addAttribute(generatedString);
//
//        return "homepage";
//    }

    @GetMapping("")
    public String homePage () {
        return "homepage";
    }
    @GetMapping("/api/boeken/{id}")
    public ResponseEntity ProductDescreption(@PathVariable Integer id, HttpServletRequest request) {
        try {
            Optional<Product> bookDetail = service.findProduct (id);
            return new ResponseEntity<>(bookDetail, HttpStatus.OK);

        }
        catch (Exception e) {
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

    @PutMapping("/api/boeken/{id}")
    public ResponseEntity updateBoeken() {
        Optional<Product> bookDetail = service.putProduct ();

        return (ResponseEntity) ResponseEntity.ok();
    }

//    @PutMapping("/employees/{id}")
//    public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeeId,
//                                                   @Valid @RequestBody Employee employeeDetails) throws ResourceNotFoundException {
//        Employee employee = employeeRepository.findById(employeeId)
//                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
//
//        employee.setEmailId(employeeDetails.getEmailId());
//        employee.setLastName(employeeDetails.getLastName());
//        employee.setFirstName(employeeDetails.getFirstName());
//        final Employee updatedEmployee = employeeRepository.save(employee);
//        return ResponseEntity.ok(updatedEmployee);
//    }
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









