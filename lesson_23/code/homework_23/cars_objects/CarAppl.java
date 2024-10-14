package homework_23.cars_objects;

import homework_23.cars_objects.model.Car;

public class CarAppl {

    public static void main(String[] args) {

        // Общее расстояние поездки:

        Car cars1 = new Car("Audi", "diesel", 1.6, 6.6, 45, 3000);
        Car cars2 = new Car("BMW", "petrol", 1.8, 6.8, 49, 3000);
        Car cars3 = new Car("Opel", "diesel", 1.6, 6.9, 45, 3000);
        Car cars4 = new Car("VW", "diesel", 1.6, 6.5, 39, 3000);
        Car cars5 = new Car("Mercedes", "petrol", 1.8, 6.3, 49, 3000);

        Car[] cars = {cars1, cars2, cars3, cars4, cars5};
        double lowestCost = Double.MAX_VALUE;       // Начальная стоимость, используем максимальное значение
        Car cheapestCar = null;                     // Переменная для хранения автомобиля с наименьшей стоимостью

        // Расчет общей стоимости для каждого автомобиля:
        for (int i = 0; i < cars.length; i++) {
            double totalCost = cars[i].calculateTotalCost();
            System.out.printf("Автомобиль: %s | Тип топлива: %s | Общая стоимость поездки: %.2f €\n", cars[i].getBrand(),cars[i].getFuelType(),totalCost );

            // Проверка наименьшей стоимости:
            if (totalCost < lowestCost) {
                lowestCost = totalCost; // Обновление минимальной стоимости
                cheapestCar = cars[i]; // Сохранение информации об автомобиле с наименьшей стоимостью
            }
        } // end of for

       // Вывод информации о самом выгодном автомобиле:
        if (cheapestCar != null) {
            System.out.printf("\nСамый выгодный автомобиль: %s с общей стоимостью поездки %.2f €\n",
                    cheapestCar.getBrand(), lowestCost);
        }
    } // end of main
} // end of class
