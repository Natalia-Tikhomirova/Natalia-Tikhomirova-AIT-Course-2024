package homework_08;

// Определение времени суток. Напишите программу, которая принимает на вход текущий час (от 0 до 23)
// и выводит приветствие в зависимости от времени суток (утро, день, вечер, ночь).

import java.util.Scanner;

public class TimesOfDay {
    public static void main(String[] args) {

        // приглашение пользователю:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the times of day: ");
        int choice = scanner.nextInt(); // scanner.nextInt позволяет получить choice - times of day

        // предлагаем choice

        switch (choice){

            case 6,7,8,9,10,11,12 -> {
                System.out.println( " This is Morning !");
            }
            case 13,14,15,16,17,18 -> {
                System.out.println( " This is Day ! ");

            }
            case 19,20,21,22 -> {
                System.out.println( " This is Evning ! ");

            }
            case 23, 24, 1, 2, 3, 4, 5 -> {
                System.out.println( " This is Night ! ");

            }
            default -> System.out.println( " Wrong input! ");

        } //end of switch

     } // end of main

} // end of class
