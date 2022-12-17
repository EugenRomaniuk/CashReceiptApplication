package by.clevertec.receipt.repository;

import by.clevertec.receipt.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.random.RandomGenerator;

public class ProductRepositoryImpl implements ProductRepository{
    private List<Product> products = new ArrayList<>();
    private final RandomGenerator randomGenerator;

    public ProductRepositoryImpl(RandomGenerator randomGenerator) {
        this.randomGenerator = randomGenerator;
        populateWithRandomValues();
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product getById(long id) {
        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Product with id = " + id + "is not found"));
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }
    private void populateWithRandomValues(){
        products = this.randomGenerator.randomizeProducts();
    }
}
