package by.clevertec.receipt.Repository;

import by.clevertec.receipt.Model.DiscountCard;

public interface DiscountCardRepository {
    /*
    Оставил комментарий в ProductRepository, прочти.
     */
    DiscountCard getAll();
    DiscountCard getByNumber(long cardNumber);
    DiscountCard save(DiscountCard discountCard);
}
