package classwork_43.car_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// - Перебор всех элементов carList с помощью forEach() и вывод их в консоль
//- Перебор всех элементов с выполнением некоторой операции над каждым элементом списка и вывод их в консоль:
// - Из регистрационного номера - достаньте только буквы
// - Сортировка списка по полю age
// - Сортировка списка по нескольким свойствам: brand, age, color.
// - Рассчитать средний возраст автомобилей
// - Сделать проверку, что у всех Car возраст (age) больше 5 лет
// - Определить количество машин разных цветов

public class CarStreamAppl {

    public static void main(String[] args) {

        List<CarStream> cars = Arrays.asList(
                new CarStream("AB123CD", "Audi", 8, "Red"),
                new CarStream("EF456GH", "Mercedes", 3, "Black"),
                new CarStream("IJ789KL", "Audi", 10, "Blue"),
                new CarStream("MN012OP", "Tesla", 3, "Green"),
                new CarStream("QR345ST", "Volkswagen", 6, "Red"),
                new CarStream("UV678WX", "Tesla", 2, "Green"));


        printCars(cars);
        System.out.println("________________________________________________________________");

        // Из регистрационного номера - достаньте только буквы
        printLettersOfRegNumber(cars);

        // - Сортировка списка по полю age
        System.out.println("__________________________Cars sorted by age___________________________");

        List<CarStream> carsByAge = sortCarByAge(cars);
        printCars(carsByAge);

        // - Сортировка списка по нескольким свойствам: brand, age, color.
        System.out.println("_________________________Cars sorted by brand, age, color_________________________");
        List<CarStream> carsSorted = sortCarByBrandAgeColor(cars);
        printCars(carsSorted);

        // - Рассчитать средний возраст автомобилей
        System.out.println("_________________________Average age_________________________");
        double averageAge = cars.stream()
                .mapToInt(CarStream::getAge)
                .average()
                .orElse(0.0); // Если список пуст, возвращает 0.0
        System.out.printf("Average age: %.2f age%n",averageAge);

        // - Сделать проверку, что у всех Car возраст (age) больше 5 лет
        System.out.println("_________________________All cars older than 5 years?_________________________");

        boolean allOlderThan5 = cars.stream()
                .allMatch(carStream -> carStream.getAge() > 5);
        System.out.println("All cars older than 5 years? " + allOlderThan5);


        // - Определить количество машин разных цветов
        System.out.println("_________________________Cars collecting by colors_________________________");
        Map<String, List<CarStream>> carsByColor = cars.stream()
                .collect(Collectors.groupingBy(CarStream::getColor));
        for (String color : carsByColor.keySet()) {
            System.out.println("Color: "+ color + " cars: " + carsByColor.get(color).size());
        }

    }



    private static List<CarStream> sortCarByBrandAgeColor(List<CarStream> cars) {
        return cars.stream()
                .sorted(Comparator.comparing(CarStream::getBrand)
                        .thenComparing(CarStream::getAge)
                        .thenComparing(CarStream::getColor)
                )
                .toList();
    }

    private static List<CarStream> sortCarByAge(List<CarStream> cars) {
        return cars.stream()
                .sorted(Comparator.comparing(CarStream::getAge))
                .toList();
    }

    private static void printLettersOfRegNumber(List<CarStream> cars) {

        printCars(cars.stream()
                .map(carStream -> {
                    return new CarStream(
                            carStream.getRegNumber().substring(0,2),
                            //carStream.getRegNumber().replaceAll("[^A-Z]", ""),
                            carStream.getBrand(),
                            carStream.getAge(),
                            carStream.getColor()
                    );

                })
                .toList()
        );
    }

    private static void printCars(List<CarStream> cars) {

//        for (CarStream car : cars) {
//            System.out.println(cars);
//        }
        cars.stream()
                .forEach(c-> System.out.println(c));

    }


} // end of class
