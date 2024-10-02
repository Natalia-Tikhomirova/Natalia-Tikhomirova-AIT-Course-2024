package homework_09;

// Написать программу-бот, который помогает выбрасывать мусор в баки разных цветов:
// - упаковки в желтый бак
// - пищевые отходы в коричневый бак
// - бумага в зеленый бак
// - прочие отходы в черный бак
// Используйте цифры для кодирования вариантов действий.

import java.util.Scanner;

public class Garbage1 {


    public static void main(String[] args) {

        int pack = 1;
        int food = 2;
        int paper = 3;
        int other = 4;

        Scanner scanner = new Scanner(System.in);

        // Бесконечный цикл для постоянного запроса ввода
        while (true) {
            System.out.println("Welcome to the separate waste collection point! Input your answer: ");
            System.out.println("1 - packaging, 2 - food waste, 3 - paper, 4 - other.");
            System.out.println("To exit enter - 0.");
            int choice = scanner.nextInt(); // получаем ответ от пользователя

            // Обрабатываем выбор с помощью switch
            switch (choice) {
                case 0 -> {
                    System.out.println("Exiting the program. Thank you for sorting your garbage!");
                    return; // Выход из программы
                }
                case 1 -> System.out.println("Yellow garbage!");  // упаковка
                case 2 -> System.out.println("Brown garbage!");   // пищевые отходы
                case 3 -> System.out.println("Green garbage!");   // бумага
                case 4 -> System.out.println("Black garbage!");   // прочее
                default -> System.out.println("Wrong input! Try again!"); // неверный ввод
            } // end of switch

        } // end of while

    } // end of main

} // end of class
