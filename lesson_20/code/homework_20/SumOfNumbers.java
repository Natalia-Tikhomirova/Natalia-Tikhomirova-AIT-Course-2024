package homework_20;

// Напишите программу, которая запрашивает у пользователя строку, содержащую целые числа, и выводит сумму всех этих введенных чисел. Используйте классы-обёртки для преобразования строк в соответствующие примитивы.

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите строку с целыми числами: ");
        String input = scanner.nextLine();

        // Разделение строки на отдельные числа:
        String[] numbers = input.split(" ");

        // Инициализация переменной для суммы:
        int sum = 0;

        // Преобразование каждой строки в целое число и добавление к сумме:
        for (int i = 0; i < numbers.length; i++) {
            int num  = Integer.parseInt(numbers[i]);            // Преобразование строки в int
            sum += num;
        }
        System.out.println("Сумма введенных чисел: " + sum);

    } // end of main
} // end of class
