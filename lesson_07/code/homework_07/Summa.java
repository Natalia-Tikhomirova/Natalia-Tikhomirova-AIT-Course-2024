package homework_07;
 // Вводится положительное целое число, найдите сумму его цифр. Пример: 1725, сумма цифр = 15

import java.util.Scanner;

public class Summa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ввод положительного целого числа
        System.out.print("Input positive integer number: ");
        int number = scanner.nextInt();

        // Переменная для хранения суммы цифр
        int sum = 0;
        int count = 0;     // счетчик
        int temp = number; // Временная переменная для подсчета цифр в числе

        // Считаем количество цифр в числе
        while (temp > 0) {
            temp = temp - (temp % 10);  // Убираем последнюю цифру
            temp = temp / 10;
            count++;
        }

        // Вычисляем сумму цифр
        while (count > 0) {
            int lastDigit = number % 10;          // Находим последнюю цифру
            sum = sum + lastDigit;                // Добавляем её к сумме
            number = (number - lastDigit) / 10;   // Убираем последнюю цифру
            count--;                              // Уменьшаем счетчик цифр
        }

        // Вывод результата
        System.out.println("Sum of digits = " + sum);
    }

}
