package by.clevertec.receipt.model;

public class DiscountCard {
    private long cardNumber;
    private float discountSize;
    public DiscountCard(){

    }
    public DiscountCard(long cardNumber, float discountSize){
        this.cardNumber = cardNumber;
        this.discountSize = discountSize;
    }
    public Long getCardNumber() { return cardNumber; }

    public void setCardNumber(Long cardNumber) { this.cardNumber = cardNumber; }

    public Float getDiscountSize() { return discountSize; }

    public void setDiscountSize(Float discountSize) { this.discountSize = discountSize; }
}
