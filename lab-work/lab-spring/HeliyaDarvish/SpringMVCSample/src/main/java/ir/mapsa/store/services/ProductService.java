package ir.mapsa.store.services;

import ir.mapsa.store.model.Product;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    List<Product> productList;

    public List<Product> products() {
        Product product1 = new Product();
        product1.setId(1L);
        product1.setName("Chips");
        product1.setCategory("foodstuffs");

        Product product2 = new Product();
        product2.setId(2L);
        product2.setName("Chitose");
        product2.setCategory("foodstuffs");

        productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);

        return productList;
    }

    public Product getProductById(Long id) throws IOException {
        for (Product product : products()){
            if (product.getId() == id){
                return product;
            }
        }
        throw new IOException("No product found");
    }
}
