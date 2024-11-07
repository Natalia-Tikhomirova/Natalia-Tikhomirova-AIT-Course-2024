package classwork_41.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetCar {
    public static void main(String[] args) {

        TreeSet<Car> carTreeSet = new TreeSet<>();

        Car[] cars = new Car[5];
        cars[0] = new Car("N4", "Model1", "C1", 2.0, "red");
        cars[1] = new Car("N3", "Model2", "C2", 2.5, "red"); // duplicat by color
        cars[2] = new Car("N2", "Model1", "C3", 3.0, "green");
        cars[3] = new Car("N1", "Model3", "C1", 1.4, "gray");
        cars[4] = new Car("N4", "Model2", "C3", 2.5, "black"); // duplicat regNumber

        for (Car car : cars) {
            carTreeSet.add(car);
        }
        System.out.println("===================================");
        System.out.println(carTreeSet.size()); //
        for (Car car: carTreeSet) {
            System.out.println(car);
        }

        Comparator<Car> comparatorByColor = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getColor().compareTo(o2.getColor());
            }
        };
        System.out.println("---------------------------------------------");

        TreeSet<Car> carTreeSetByColor = new TreeSet<>(comparatorByColor); // сортировка по цвету

        for (Car car : cars) {
            carTreeSetByColor.add(car);
        }

        for (Car car: carTreeSetByColor) {
            System.out.println(car);
        }

        System.out.println("=============================");

        TreeSet<Car> carTreeSetByCompany = new TreeSet<>(Comparator.comparing(Car::getCompany)); // сортировка по компании
        for (Car car: cars ) {
            carTreeSetByCompany.add(car);
        }
        for (Car car: carTreeSetByCompany) { // идем по всем Car с переменной car, залезаем в  carTreeSetByCompany и печатаем car.
            System.out.println(car);
        }

    }

} // end of class
