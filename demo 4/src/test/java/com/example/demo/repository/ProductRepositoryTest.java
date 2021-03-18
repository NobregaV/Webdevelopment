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
        product.setProductName("Master your Mindset");
        product.setFoto("https://media.s-bol.com/mYvGgDgQX8nR/550x774.jpg");
        product.setProductDesription("Master Your Mindset herziene uitgave november 2020) gaat over persoonlijke en spirituele groei, maar ook over zakelijk succes. Die combina...");
        product.setStockUpdate(2);

        Product savedProduct = repo.save(product);
        Product existProduct = testEntityManager.find(Product.class, savedProduct.getId());
        assertThat(product.getId()).isEqualTo(existProduct.getId());
    }

}
