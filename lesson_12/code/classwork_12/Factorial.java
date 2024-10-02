package classwork_12;

// Вводится n - натуральное число.
// Напишите метод, который получает на вход n и вычисляет n! = 1 * 2 * 3 *... * n.
// Вызовите полученный метод.
// При каком значении n происходит переполнение памяти (результат станет отрицательным),
// выделяемой для значения n! типа int? Использовать цикл for.
//  при n = 17

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter natural number: ");
        int n = scanner.nextInt();
        System.out.print(", " + n + "! = " + factorial(n));

    } // End of main

    public static int factorial(int n){
        int mul = 1;
        for (int i = 1; i <= n; i++) {
            mul *= i;
            if (i == 1){
                System.out.print(i);
            }
            else {
                System.out.print(" * " + i);
            }
        } // end of for
        return mul;
    } // end of method
} // end of class