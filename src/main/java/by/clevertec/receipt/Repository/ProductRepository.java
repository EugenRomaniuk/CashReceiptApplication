package by.clevertec.receipt.Repository;

import by.clevertec.receipt.Model.Product;

public interface ProductRepository {
    /*
        Здесь определяю методы для работы с продуктами: getById, getAll и т.д
        Правда не уверен с параметрами методов.
        В гетОл по сути ничего не нужно, просто вывод массивов с данными
        В гетБайАйди передаем айди для поиска нужного товара
        В сейв я думаю, что нужно передавать объект типа Product, а потом в ProductRepositoryImpl
        реализовывать этот метод так, чтобы он разбивал каждое поле (Id, productName, price, count) и вставлял их
        в отдельные массивы для этих данных
     */
    Product getAll();
    Product getById(long Id);
    Product save(Product product);
}
