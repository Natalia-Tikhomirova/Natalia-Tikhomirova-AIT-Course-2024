package homework;



// Пользователь с клавиатуры вводит число от 1 до 12,
// программа сообщает, какому времени года принадлежит введенный месяц.

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of month: ");
        int month = scanner.nextInt();

        switch (month){

            case 1 -> {
                System.out.println(" This is Yanuary!");
            }
            case 2 -> {
                System.out.println(" This is February!");
            }
            case 3 -> {
                System.out.println(" This is March!");
            }
            case 4 -> {
                System.out.println(" This is April!");
            }
            case 5 -> {
                System.out.println(" This is May!");
            }
            case 6 -> {
                System.out.println(" This is June!");
            }
            case 7 -> {
                System.out.println(" This is July!");
            }
            case 8 -> {
                System.out.println(" This is August!");
            }
            case 9 -> {
                System.out.println(" This is September!");
            }
            case 10 -> {
                System.out.println(" This is October!");
            }
            case 11 -> {
                System.out.println(" This is November!");
            }
            case 12 -> {
                System.out.println(" This is December!");
            }
            default -> System.out.println("Wrong input");

        }

    }
}
