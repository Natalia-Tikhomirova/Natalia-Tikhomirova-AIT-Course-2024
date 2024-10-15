package classwork_08;

// Пользователь вводит натуральное число n. Определите, является ли оно простым.
//Простое число - это такое число, которое делится **ТОЛЬКО** на себя и на 1.
//Примеры: 2, 3, 5, 7, 11, 13, 17, 19, ...
//Обеспечьте защиту от ввода пользователем отрицательных чисел.
// 31, 37 - пример простых чисел в 3-м десятке
//3 и 5, 5 и 7, 7 и 11, 11 и 13, 17 и 19 - близнецы, т.к. между ними только 1 число
// 15 - перебирая числа от 1 и дальше, смотрим, делится ли на него число или нет

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input integer positive number: ");

        int number = scanner.nextInt(); // scanner.nextInt позволяет получить number

        // check correct number

        while (number <= 0) {

            System.out.println(" Wrong input! "); // при вводе отриц числа печатаем:
            System.out.println(" Try again, pls!");
            number = scanner.nextInt(); // ввод еще раз

        } // end of cicle

        boolean isPrime = isPrimeNumber(number); // передаем объект в метод и сздаем его
        System.out.println(number + " is prime: " + isPrime);

    } // end of main

    private static boolean isPrimeNumber(int number) {  // boolean - истина или ложь

        int div = 2;//  в методе понадобился целочисленный делитель
        //  boolean isPrime = true;
        while (div < number) {

            if (number % div == 0) { // если остаток от деления равен 0, то
                return false;        // False
                // return isPrime

            } // end of if
            div++;

        } // end of cycle

        return true;


    } // end of method

} // end of class

