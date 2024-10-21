package homework_27.supermarket.dao;

import homework_27.supermarket.model.Food;
import homework_27.supermarket.model.Product;


public class SupermarketImpl implements  Supermarket{

    Product[] products;
    int count;

    public SupermarketImpl(int capacity) {
        this.products = new Product[capacity];
        this.count = 0;
    }

    @Override
    public boolean addProduct(Product product) {
        if (product == null) {
            return false;
        }
        if(count == products.length) {
            return false;
        }
        if(findProductByBarCode(product.getBarCode()) != null){
            return false;
        }
        products[count] = product;
        count++;
        return true;
    }


      @Override
    public Product findProductByBarCode(long barCode) {
        for (int i = 0; i < count; i++) {
            if(products[i].getBarCode() == barCode){
                return products[i];
            }
        }
        return null;
    }

    @Override
    public Product findProductByExpDate(String expDate) {
        for (int i = 0; i < count; i++) {
            if(products[i]instanceof Food food && food.getExpDate().equals(expDate)){
                return products[i];
            }
        }
        return null;
    }

    @Override
    public Product removeProduct(String expDate) {
        for (int i = 0; i < count; i++) {
            if (products[i] != null && products[i] instanceof Food food && food.getExpDate().equals(expDate)) {
                Product victim = products[i];
                products[i] = products[count - 1];
                products[count - 1] = null;
                count--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public double totalCost() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += products[i].getPrice();
        }
        return total;
    }

    @Override
    public double averageCost() {
        if(count == 0){
            return 0;
        }
        return totalCost()/count;
    }

    @Override
    public int count() {
        return count;
    }

    @Override
    public void printProducts() {
        for (int i = 0; i < count; i++) {
            System.out.println(products[i]);
        }
    }

} // end of class
