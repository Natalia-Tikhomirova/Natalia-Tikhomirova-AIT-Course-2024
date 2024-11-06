package homework_39.supermarket.dao;

import homework_39.supermarket.model.Product;

import java.util.Collection;

public class SupermarketImpl implements Supermarket {

    private Collection<Product>products;

    public SupermarketImpl(Collection<Product> products) {
        this.products = products;
    }

    @Override
    public boolean addProduct(Product product) {
        return false;
    }

    @Override
    public Product removeProduct(long barCode) {
        return null;
    }

    @Override
    public Product findByBarCode(long barCode) {
        return null;
    }

    @Override
    public Iterable<Product> findByCategory(String category) {
        return null;
    }

    @Override
    public Iterable<Product> findByBrand(String brand) {
        return null;
    }

    @Override
    public Iterable<Product> findProductsWithExpiredDate() {
        return null;
    }

    @Override
    public int skuQuantity() {
        return 0;
    }
} // end of class
