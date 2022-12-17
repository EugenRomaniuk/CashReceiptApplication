package by.clevertec.receipt.model;

public class Product {
    private long id;
    private String nameProduct;
    private float price;
    private int count;
    public Product(){

    }
    public Product(long id, String nameProduct, float price, int count){
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.count = count;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNameProduct() {
        return nameProduct;
    }
    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Float getPrice() {
        return price;
    }
    public void setPrice(Float price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
}
