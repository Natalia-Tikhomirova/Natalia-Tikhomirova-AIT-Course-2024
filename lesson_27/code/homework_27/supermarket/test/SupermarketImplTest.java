package homework_27.supermarket.test;

import homework_27.supermarket.dao.Supermarket;
import homework_27.supermarket.dao.SupermarketImpl;
import homework_27.supermarket.model.Food;
import homework_27.supermarket.model.MeatFood;
import homework_27.supermarket.model.MilkFood;
import homework_27.supermarket.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketImplTest {

    Supermarket supermarket;
    Product[]products;

    @BeforeEach
    void setUp() {

        supermarket = new SupermarketImpl(4);
        products = new Product[4];
        products[0] = new Food(5,"bread",1234567890L,"2024-11-25");
        products[1] = new Food(10,"cake",1234567891L,"2024-10-15");
        products[2] = new MilkFood(2.5,"Oat milk",1234567892L,"2024-11-11","Milk",2.5);
        products[3] = new MeatFood(10,"ground meet",1234567893L,"2024-11-15","beef");

        for (int i = 0; i < products.length; i++) {
            supermarket.addProduct(products[i]);
        }

    }

    @Test
    void addProductTest() {
        assertFalse(supermarket.addProduct(null));
        Product newProduct = new Food(15,"cake",1234567899L,"2025/10/11");
        assertFalse(supermarket.addProduct(newProduct));
    }

    @Test
    void findProductByBarCodeTest() {
        assertEquals(products[1],supermarket.findProductByBarCode(1234567891L));
        assertNull(supermarket.findProductByBarCode(1234567896L));
    }

    @Test
    void findProductByExpDateTest() {
        assertEquals(products[0],supermarket.findProductByExpDate("2024-11-25"));
        assertNull(supermarket.findProductByExpDate("2024-10-29"));
        assertNull(supermarket.findProductByExpDate("2024-11-12"));
    }

    @Test
    void removeProductTest() {
        assertEquals(products[1],supermarket.removeProduct("2024-10-15"));
        assertNull(supermarket.removeProduct("2024-10-15"));
    }

    @Test
    void totalCostTest() {
        double expectedTotalCost = 5 + 10 + 2.5 + 10;
        double actualTotalCost = supermarket.totalCost();
        assertEquals(expectedTotalCost,actualTotalCost);
    }

    @Test
    void averageCostTest() {
        double expectedAverageCost = (5 + 10 + 2.5 + 10) / 4;
        double actualAverageCost = supermarket.averageCost();
        assertEquals(expectedAverageCost,actualAverageCost);
    }

    @Test
    void countTest() {
        assertEquals(4,supermarket.count());
    }

    @Test
    void printProductsTest() {
        System.out.println("============================");
        supermarket.printProducts();
    }

} // end of class