package by.clevertec.receipt.Model;

public class Product {

        /* Здесь опишу названия продуктов: огурец, бебра, помидор, сыр и т.д.
    Но как мне описать целый объект по типу 5 Огурец 15.34(как в чеке), где Огурец название, а 15.34 - цена?
    ли у меня может быть два массива и я просто буду по индексу доставать как-то?
    Так же мне нужно будет прописать гетеры и сетеры или здесь у меня просто будут храниться данные(массив с ценой и названием)?
    Ну и если так, то по такой же аналогии со скидочной картой, в которой пропишу номер карточки и размер скидки?
     */

    private Long Id;
    private String nameProduct;
    private Float price;
    private Long count;
    public Product(){

    }

    public Long getId() { return Id; }
    public void setId(Long id) { this.Id = id; }

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

    public Long getCount() {
        return count;
    }
    public void setCount(Long count) {
        this.count = count;
    }
}
