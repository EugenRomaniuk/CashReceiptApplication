package by.clevertec.receipt.repository;

import by.clevertec.receipt.model.DiscountCard;

import java.util.List;

public interface DiscountCardRepository {
    List<DiscountCard> getAll();
    DiscountCard getByNumber(long cardNumber);
    void save(DiscountCard discountCard);
}
