package homework_40.ait.supermarket_linkedlist;

import homework_40.ait.supermarket_linkedlist.dao.SupermarketImpl;
import homework_40.ait.supermarket_linkedlist.model.Product;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

public class SupermarketAppl {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        SupermarketImpl myMarket = new SupermarketImpl();
        Collection<Product> products = new LinkedList<>();


        products.add(new Product(111111, "White Bread", "Bread", "Kolosok", 6.5, now.plusDays(5)));
        products.add(new Product(222222, "ChocoMilk", "Dairy", "MilkLand", 13, now.minusDays(3)));
        products.add(new Product(333333, "Cheese Gouda", "Dairy", "Farmer", 22.5, now.plusDays(50)));
        products.add(new Product(444444, "Cheese Cheddar", "Dairy", "MilkLand", 30, now.plusDays(85)));
        products.add(new Product(555555, "Sweet Beans", "Bread", "Kolosok", 18.3, now.minusDays(25)));

        for (Product p : products) {
            myMarket.addProduct(p);
        }

        // menu с опциями: 1 - склад, 2 - просрочка, 3 - продукты по категории, 4 - продукты по бренду,  ...

        System.out.println("Products by Category: ");
        Iterable<Product> res = myMarket.findByCategory("bread");
        System.out.println(res);

    } // end of main
} // end of class
