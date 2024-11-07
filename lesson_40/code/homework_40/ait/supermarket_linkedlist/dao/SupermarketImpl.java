package homework_40.ait.supermarket_linkedlist.dao;

import homework_40.ait.supermarket_linkedlist.model.Product;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;

//

public class SupermarketImpl implements Supermarket {

    // constructor
    // array[capacity]
    // int size
    // теперь этого делать не надо

    private Collection<Product> products = new LinkedList<>();


    @Override
    public boolean addProduct(Product product) {
        if (product == null || products.contains(product)) { // если содержит такой же
            return false;
        }
        return products.add(product); // создание нового узла и добавление в конец списка(устанавливаются ссылки для нового узла и предыдущего последнего)
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
        List<Product> res = new LinkedList<>();
        for (Product p : products) {
            if(predicate.test(p)){
                res.add(p);
            }
        }
        return res;
    }

} // end of class
