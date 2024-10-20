package homework_27.supermarket.dao;

import homework_27.supermarket.model.Product;

public interface Supermarket {

    boolean addProduct(Product product);
    Product findProductByBarCode(long barCode);
    Product findProductByExpDate(String expDate);
    Product removeProduct(String expDate);
    int count();
    double totalCost();
    double averageCost();
    void printProducts();

} // end of class
