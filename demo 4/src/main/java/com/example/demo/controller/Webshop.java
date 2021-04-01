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


import javax.persistence.criteria.CriteriaBuilder;
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
        } catch (Exception e) {
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
//Request is krijgen/ontvangen en response is geven/verzenden
    @PutMapping("/api/boeken/{id}/besteld")
public ResponseEntity updateVoorraad(@RequestBody Integer stockUpdate, @PathVariable Integer id) {
        try {
//Dit is de gehele object met daarin product gegevens (titel, omschrijving, id, voorraad)
  Optional<Product> productdetail = service.findProduct(id);

// variabel aangemaakt voor wat de huidige voorraad is
  Integer huidigeVoorraad = productdetail.get().getStockUpdate();

//Variabel aangemaakt voor nadat er besteld is met de som: bestelling afgetrokken van huidige voorraad.
  Integer naBestelling = huidigeVoorraad - stockUpdate;

//  Dit is de nieuwe voorraad nadat er besteld is
  productdetail.get().setStockUpdate(naBestelling);

//Hiermee sla je het op.
service.createNewBoek(productdetail.get());

  return new ResponseEntity(productdetail.get(), HttpStatus.OK);


        } catch (Exception e) {
            return new ResponseEntity("Voorraad niet gewijzigd", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

/**
 *   Bij het bestellen van een product moet je voorraad ook minder worden.
 * //    Welke info wil je binnen krijgen?
 * //    id om waar het gaat en voorraad-aantal.
 * putmapping update
 */























