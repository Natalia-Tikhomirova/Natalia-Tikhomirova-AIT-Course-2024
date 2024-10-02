package homework_08;

// В кинотеатре есть разные типы билетов: стандартный, студенческий (-10%) и для пенсионеров(-25%).
// Каждый тип билета имеет свою стоимость. Клиент может также выбрать место в VIP-зоне,
// что увеличит стоимость билета на 25%. Создайте метод calculateTicketPrice,
// который принимает возраст клиента, статус студента и флаг VIP-места, а возвращает итоговую стоимость билета.
// Реализуйте приложение-бот, которое задает необходимые вопросы и объявляет стоимость билета.


import java.util.Scanner;

public class Cinema {

// Метод для вычисления стоимости билета
public static double calculateTicketPrice(int age, boolean isStudent, boolean isVIP) {
    double basePrice = 15;         // Стандартная стоимость билета в евро
    double discountPercentage = 0; // Процент скидки


    // Определение процента скидки в зависимости от возраста и статуса студента

    if  (age < 67) {
        discountPercentage = 0;  // Стандартная цена
        } else if (age >= 67) {
        discountPercentage = 25; // Скидка для пенсионеров
        } else if (isStudent) {
        discountPercentage = 10; // Скидка для студентов
        }

    // Применение скидки
     double finalPrice = basePrice - (basePrice * discountPercentage / 100);

    // Применение надбавки за VIP-место
    if (isVIP) {
        finalPrice *= 1.25; // Надбавка 25% за  VIP
        }

    return finalPrice;

}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);        // Ввод вопросов пользователю

    System.out.print(" Input age : ");
    int age = scanner.nextInt();                    // сканер позволяет получить age

    System.out.print(" Student (true/false): ");
    boolean isStudent = scanner.nextBoolean();      // сканер позволяет получить isStudent

    System.out.print(" VIP-place (true/false): ");
    boolean isVIP = scanner.nextBoolean();          // сканер позволяет получить isVIP

    // Вычисление стоимости билета
    double ticketPrice = calculateTicketPrice(age, isStudent, isVIP);

    // Вывод итоговой стоимости билета
    System.out.printf("Final price : " + ticketPrice + " Euro.");

  } // end of main

} // end of class




