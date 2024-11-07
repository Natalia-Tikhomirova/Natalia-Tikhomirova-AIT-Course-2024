package classwork_40.ait.supermarket_hashSet.dao;

import classwork_40.ait.supermarket_hashSet.model.Product;

public interface Supermarket extends Iterable<Product>{

    boolean addProduct(Product product);

    Product removeProduct(long barCode);

    Product findByBarCode(long barCode);

    Iterable<Product> findByCategory(String category);

    Iterable<Product> findByBrand(String brand);

    Iterable<Product> findProductsWithExpiredDate();

    int skuQuantity();

} // end of class
