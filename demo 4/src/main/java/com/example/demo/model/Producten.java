package com.example.demo.model;

public class Producten {

    private int id;
    private String productName;
    private Double productPrice;
    private String productDesription;
    private int stockUpdate;

    public Producten(int id, String productName, Double productPrice, String productDesription, int stockUpdate) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDesription = productDesription;
        this.stockUpdate = stockUpdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getStockUpdate() {
        return stockUpdate;
    }

    public void setStockUpdate(int stockUpdate) {
        this.stockUpdate = stockUpdate;
    }
}
