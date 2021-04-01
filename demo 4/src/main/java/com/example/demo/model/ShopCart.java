package com.example.demo.model;
import javax.persistence.*;


@Entity
@Table(name="Cart")

public class ShopCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCart;

    @Column(nullable = false, length = 50, unique = true)
    private Double totalPriceCart;
    private Integer amountBoek;

    @ManyToOne
    @Column
    private Product books;
//    TODO Misschien de @ManytoOne bij de parent ipv child. En dan hier misschien de @Onetomany

    public Double getTotalPriceCart() {
        return totalPriceCart;
    }

    public void setTotalPriceCart(Double totalPriceCart) {
        this.totalPriceCart = totalPriceCart;
    }

    public Integer getTotalItemsCart() {
        return amountBoek;
    }

    public void setTotalItemsCart(Integer totalItemsCart) {
        this.amountBoek = totalItemsCart;
    }

    public Product getBooks() {
        return books;
    }

    public void setBooks(Product books) {
        this.books = books;
    }
}
