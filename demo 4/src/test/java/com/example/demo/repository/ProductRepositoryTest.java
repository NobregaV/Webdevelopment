package com.example.demo.repository;

import com.example.demo.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class ProductRepositoryTest {

    @Autowired
    private TestEntityManager testEntityManager;
    @Autowired
    private ProductRepository repo;

    @Test
    public void testCreateProduct() {
        Product product = new Product();

        product.setProductPrice(4.99);
        product.setProductName("Burn after writing");
        product.setFoto("https://media.s-bol.com/Y59R00ppq1G0/550x800.jpg");
        product.setProductDesription("Hoe eerlijk ben jij als niemand kijkt? Het lijkt wel alsof de wereld alleen maar draait om wat je deelt en wie je bent op Instagram, TikTok, Snapchat of YouTube.");
        product.setStockUpdate(33);

        Product savedProduct = repo.save(product);
        Product existProduct = testEntityManager.find(Product.class, savedProduct.getId());
        assertThat(product.getId()).isEqualTo(existProduct.getId());
    }

}
