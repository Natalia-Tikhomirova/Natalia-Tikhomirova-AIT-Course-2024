package homework_29.car_sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class CarTest {

    Car[] cars;

    @BeforeEach
    void setUp() {

        cars = new Car[5];
        cars[0] = new Car("A123BC", "Toyota", 2019, 20000.0, "Red");
        cars[1] = new Car("B456CD", "Honda", 2018, 18000.0, "Blue");
        cars[2] = new Car("C789DE", "BMW", 2020, 35000.0, "Black");
        cars[3] = new Car("D012EF", "Mercedes", 2017, 40000.0, "White");
        cars[4] = new Car("E345FG", "Ford", 2021, 25000.0, "Red");

    }

    @Test
    void sortCarByBrandTest(){

        Comparator<Car> comparatorByBrand = new Comparator<Car>() {
            @Override
            public int compare(Car brand1, Car brand2) {
                return brand1.getBrand().compareTo(brand2.getBrand());
            }
        };
        System.out.println("_______________List cars as is_______________________");
        printCars(); // print as is
        System.out.println("============List cars sorted by brand==================");
        Arrays.sort(cars,comparatorByBrand); // sorting
        printCars(); // print after sorting
            }

    @Test
    void sortCarByColorTest(){

        Comparator<Car> comparatorByColor = new Comparator<Car>() {
            @Override
            public int compare(Car color1, Car color2) {
                return color1.getColor().compareTo(color2.getColor());
            }
        };
        System.out.println("_______________List cars as is_______________________");
        printCars();
        System.out.println("============List cars sorted by color==================");
        Arrays.sort(cars,comparatorByColor);
        printCars();



    }
    @Test
    void sortCarByPriceTest(){
        Comparator<Car> comparatorByPrice = new Comparator<Car>() {
            @Override
            public int compare(Car price1, Car price2) {
                return Double.compare(price1.getPrice(),price2.getPrice());
            }
        };
        System.out.println("_______________List cars as is_______________________");
        printCars();
        System.out.println("============List cars sorted by price==================");
        Arrays.sort(cars,comparatorByPrice);
        printCars();


    }
    @Test
    void sortCarByYearTest(){

        System.out.println("_______________List cars as is_______________________");
        printCars();
        System.out.println("============List cars sorted by year==================");
        Arrays.sort(cars);
        printCars();

    }

    @Test
    void printCars(){
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }


} // end of class