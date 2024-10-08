package homework_19;

// Создать класс MarketAppl и в нем метод main. В методе main создать массив в котором хранятся по одному объекту для каждого продукта.
// Реализовать методы:
// - печатающий все продукты из массива
// - метод возвращающий сумму цен всех продуктов.
// В классе MarketAppl создать метод принимающий баркод и возвращающий продукт с данным баркодом. В методе main вызвать новые методы. Результат их работы напечатать в консоль.

import homework_19.model.Food;
import homework_19.model.MeatFood;
import homework_19.model.MilkFood;
import homework_19.model.Product;

import java.util.Scanner;

public class MarketAppl {
    public static void main(String[] args) {

        Product[] products = new Product[4];
        products[0] = new Product(5,"Magazine",12345678999L);
        products[1] = new Food(4,"bread",12345678963L,"11.10.24");
        products[2] = new MeatFood(10,"ground meet",12345678984L,"15.10.24","beef");
        products[3] = new MilkFood(2,"Oat milk",12345678952L,"10.02.25","Milk",2.5);

        // Печать всех продуктов:
        printAllProducts(products);

        System.out.println("=================================================================");

        // Сумма цен всех продуктов
        double totalPrice = calculateTotalPrice(products);
        System.out.println( "Total price = " + totalPrice + " euro.");

        System.out.println("=================================================================");

        // Поиск продукта по штрих-коду:
        Scanner scanner = new Scanner(System.in);                // Запрос штрих-кода у пользователя
        System.out.println("Введите штрих-код для поиска продукта: ");
        long barCode = scanner.nextLong();                       // Чтение штрих-кода

        Product foundProduct = findProductByBarCode(products,barCode);

        // Печать найденного продукта:
        if(foundProduct != null){
            System.out.println("Найденный продукт: " + foundProduct);
        }else{
            System.out.println("Продукт с баркодом " + barCode + " не найден.");
        } // end of if

        System.out.println("=================================================================");

        // Печать всех непищевых продуктов:
        printNonFoodProducts(products);

    } // end of main

    // Метод для печати всех продуктов:
    public static void printAllProducts(Product[]products){
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        } // end of for
    } // end of method

    // Метод для подсчета суммы цен всех продуктов
    public static double calculateTotalPrice(Product[]products){
        double totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            totalPrice += products[i].getPrice();
        } // end of for
        return totalPrice;
    } // end of method

    // Метод для поиска продукта по штрих-коду
    public static Product findProductByBarCode(Product[]products, long barCode){
        for (int i = 0; i < products.length; i++) {
            if(products[i].getBarCode() == barCode){
                return products[i];  // Возвращаем продукт, если штрих-код совпадает
            }
        } // end of for

        return null;                                          // Возвращаем null, если продукт не найден

    } // end of method

    // Метод для печати всех непищевых продуктов
    public static void printNonFoodProducts(Product[]products){
        System.out.println( "Непищевые продукты: ");
        boolean foundNonFood = false;
        for (int i = 0; i < products.length; i++) {
            if(products[i] instanceof Food){                // Если это пищевой продукт, просто пропускаем
            }else {
                System.out.println(products[i]);            // Если это непищевой продукт, выводим его
            }
        } // end of for
    } // end of method
} // end of class
