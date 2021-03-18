package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="boeken")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

  @Column(nullable = false, length = 50)
    private String productName;
    private Double productPrice;
    private String productDesription;
    private Integer stockUpdate;
    private String foto;

//    public Product(String productName, Double productPrice, String productDesription, Integer stockUpdate) {
//
//        this.productName = productName;
//        this.productPrice = productPrice;
//        this.productDesription = productDesription;
//        this.stockUpdate = stockUpdate;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDesription() {
        return productDesription;
    }

    public void setProductDesription(String productDesription) {
        this.productDesription = productDesription;
    }

    public Integer getStockUpdate() {
        return stockUpdate;
    }

    public void setStockUpdate(Integer stockUpdate) {
        this.stockUpdate = stockUpdate;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}


