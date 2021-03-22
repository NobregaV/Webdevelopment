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

        product.setProductPrice(21.99);
        product.setProductName("De edele kunst van not giving a fuck");
        product.setFoto("https://media.s-bol.com/mZQ42MA3QBPn/544x840.jpg");
        product.setProductDesription("Van populair weblog naar New York Times-bestseller is dit hét boek voor zelfhulphaters!");
        product.setStockUpdate(8);

        Product savedProduct = repo.save(product);
        Product existProduct = testEntityManager.find(Product.class, savedProduct.getId());
        assertThat(product.getId()).isEqualTo(existProduct.getId());
    }

}
