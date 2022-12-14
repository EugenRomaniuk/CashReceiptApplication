package by.clevertec.receipt.Model;

public class DiscountCard {
    /*
    Описываю скидочную карту
     */
    private Long cardNumber;
    private Float discountSize;
    // Не уверен на счет модификатора доступа у коснтруктора
    public DiscountCard(){

    }
    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Float getDiscountSize() {
        return discountSize;
    }

    public void setDiscountSize(Float discountSize) {
        this.discountSize = discountSize;
    }
}
