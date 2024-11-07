package classwork_40.ait.supermarket_hashSet.dao;

import classwork_40.ait.supermarket_hashSet.model.Product;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;

public class SupermarketImpl implements Supermarket {

    // constructor
    // array[capacity]
    // int size
    // теперь этого делать не надо

    private Collection<Product> products = new HashSet<>();


    @Override
    public boolean addProduct(Product product) {
        if (product == null) { // не содержит такой же элемент, в hashSet нет дубликатов, проверка не нужна
            return false;
        }
        return products.add(product);
    }


    @Override
    public Product removeProduct(long barCode) {
        Product product = findByBarCode(barCode);
        products.remove(product);
        return product;
    }

    @Override
    public Product findByBarCode(long barCode) {

        for (Product p : products) {
            if(p.getBarCode() == barCode){
                return p;
            }
        }
        return null;
    }

    @Override
    public Iterable<Product> findByCategory(String category) {
        return findByPredicate(product -> product.getCategory().equalsIgnoreCase(category));
    }

    @Override
    public Iterable<Product> findByBrand(String brand) {
        return findByPredicate(product -> product.getBrand().equalsIgnoreCase(brand));
    }

    @Override
    public Iterable<Product> findProductsWithExpiredDate() {
        return findByPredicate(product -> product.getExpDate().isBefore(LocalDate.now()));
    }

    @Override
    public int skuQuantity() {
        return products.size();
    }

    @Override
    public @NotNull Iterator<Product> iterator() { // перебирает все коллекции
        return products.iterator();
    }

    private Iterable<Product> findByPredicate(Predicate<Product> predicate){
        Set<Product> res = new HashSet<>();
        for (Product p : products) {
            if(predicate.test(p)){
                res.add(p);
            }
        }
        return res;
    }

} // end of class
