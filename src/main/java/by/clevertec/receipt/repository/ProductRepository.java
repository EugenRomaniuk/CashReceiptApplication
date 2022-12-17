package by.clevertec.receipt.repository;

import by.clevertec.receipt.model.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> getAll();
    Product getById(long id);
    void save(Product product);
}
