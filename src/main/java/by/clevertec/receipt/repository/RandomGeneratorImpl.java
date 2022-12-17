package by.clevertec.receipt.repository;

import by.clevertec.receipt.model.DiscountCard;
import by.clevertec.receipt.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGeneratorImpl implements RandomGenerator{
    private final Random random = new Random();
    private int count = 0;
    @Override
    public List<Product> randomizeProducts() {
        ArrayList<Product> products = new ArrayList<>();
        for (long i = 1L; i < 25L; i++){
            products.add(new Product(i,
                    "Random Product № " + i,
                    generateRandomPrice(),
                    generateRandomQuantity()));
        }
        return products;
    }

    @Override
    public List<DiscountCard> randomizeCards() {
        ArrayList<DiscountCard> discountCards = new ArrayList<>();
        for (long i = 1L; i < 25L; i++){
            discountCards.add(new DiscountCard(generateRandomCardNumber(),
                    generateRandomDiscountSize()));
        }
        return discountCards;
    }

    private long generateRandomCardNumber() {
        return random.nextLong() * (1000000 - 500000) + 1;
    }

    private float generateRandomDiscountSize() {
        return  random.nextFloat() * (100 - 1) + 1;
    }

    private  float generateRandomPrice(){
        return random.nextFloat() * (1000 - 1) + 1;
    }
    private int generateRandomQuantity(){
        if(count == 4) return 0;
        count++;
        return random.nextInt(10 - 1) + 1;
    }
}
