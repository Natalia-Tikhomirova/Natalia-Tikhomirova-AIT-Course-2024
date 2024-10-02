package homework_09;

// Написать программу-бот, который помогает выбрасывать мусор в баки разных цветов:
// - упаковки в желтый бак
// - пищевые отходы в коричневый бак
// - бумага в зеленый бак
// - прочие отходы в черный бак
// Используйте цифры для кодирования вариантов действий.

import java.util.Scanner;

public class Garbage {

    public static void main(String[] args) {

        int pack = 1;
        int food = 2;
        int paper = 3;
        int other = 4;

        Scanner scanner = new Scanner(System.in);
        System.out.println( " Welcome to the separate waste collection point! Input your answer: ");
        System.out.println( " 1 - packaging, 2 - food waste, 3 - paper, 4 - other. ");
        int choice = scanner.nextInt(); //  получаем ответ от пользователя

        switch (choice){

            case 1 -> System.out.println( " Yellow garbage! ");
            case 2 -> System.out.println( " Brown garbage! ");
            case 3 -> System.out.println( " Green garbage! ");
            case 4 -> System.out.println( " Black garbage! ");
            default -> System.out.println( " Wrong input! Try again! ");

        } // end of switch

    } // end of main

} // end of class
