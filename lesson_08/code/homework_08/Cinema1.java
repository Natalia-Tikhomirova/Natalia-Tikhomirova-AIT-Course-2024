package homework_08;

// В кинотеатре есть разные типы билетов: стандартный, студенческий (-10%) и для пенсионеров(-25%).
// Каждый тип билета имеет свою стоимость. Клиент может также выбрать место в VIP-зоне,
// что увеличит стоимость билета на 25%. Создайте метод calculateTicketPrice,
// который принимает возраст клиента, статус студента и флаг VIP-места, а возвращает итоговую стоимость билета.
// Реализуйте приложение-бот, которое задает необходимые вопросы и объявляет стоимость билета.


import java.util.Scanner;

public class Cinema1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод возраста клиента
        System.out.print("Input the age: ");
        int age = scanner.nextInt();

        // Ввод выбора VIP-места
        System.out.print("VIP место ( true / false ): ");
        boolean VIP = scanner.nextBoolean();

        double basePrice = 15; // Стандартный билет
        double discountPercentage; // Процент скидки

        // Определение процента скидки в зависимости от возраста
        if (age > 18 && age < 23) {
            discountPercentage = 10;
        } else if (age >= 67) {
            discountPercentage = 25;
        } else {
            discountPercentage = 0;
        }

        // Расчет финальной стоимости билета с учетом скидки
        double finalPrice = basePrice - (basePrice * discountPercentage / 100);

        // Применение надбавки за VIP-место
        if (VIP) {
            finalPrice *= 1.25; // Надбавка 25%  finalPrice = finalPrice * 1.25
        }

        // Вывод итоговой стоимости билета
        System.out.printf("Final price : " + basePrice + " Euro.");


    } // end of main

} // end of class