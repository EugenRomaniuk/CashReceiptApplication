package by.clevertec.receipt.repository;


import by.clevertec.receipt.model.DiscountCard;
import by.clevertec.receipt.model.Product;

import java.util.List;

public interface RandomGenerator {
    List<Product> randomizeProducts();
    List<DiscountCard> randomizeCards();
}
