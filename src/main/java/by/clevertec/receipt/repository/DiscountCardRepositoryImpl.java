package by.clevertec.receipt.repository;

import by.clevertec.receipt.model.DiscountCard;

import java.util.ArrayList;
import java.util.List;
public class DiscountCardRepositoryImpl implements DiscountCardRepository {
    private List<DiscountCard> discountCards = new ArrayList<>();
    private final RandomGenerator randomGenerator;

    public DiscountCardRepositoryImpl(RandomGenerator randomGenerator) {
        this.randomGenerator = randomGenerator;
        populateWithRandomValues();
    }

    @Override
    public List<DiscountCard> getAll() {
        return discountCards;
    }

    @Override
    public DiscountCard getByNumber(long cardNumber) {
        return discountCards.stream()
                .filter(discountCard -> discountCard.getCardNumber() == cardNumber)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Card with number " + cardNumber + "is not found"));
    }

    @Override
    public void save(DiscountCard discountCard) {
        discountCards.add(discountCard);
    }
    private void populateWithRandomValues(){
        discountCards = this.randomGenerator.randomizeCards();
    }
}
