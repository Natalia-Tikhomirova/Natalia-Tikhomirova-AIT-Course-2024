package homework_23.model;

// Для метода проверки, является ли число простым, написать тест. Использовать assert для логических выражений.

import java.util.Scanner;

public class PrimeNumber1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input integer positive number: ");

        int number = scanner.nextInt();

        boolean isPrime = isPrimeNumber(number);
        System.out.println(number + " is prime: " + isPrime);


    } // end of main


    public static boolean isPrimeNumber(int number) {

        if (number <= 1) {
            return false;                      // 1 и меньше не являются простыми
        }
        for (int div = 2; div < number; div++) {
            if (number % div == 0) {
                return false;                  // Число делится на div, значит, оно не простое
            }
        }
        return true;                           // Число простое
    }


}


