package homework_07;

// Программа получает на вход строку и число повторений этой строки.
//Программа должна вывести эту строку нужное количество раз.
// Пример: строка - молоко, кол-во раз - 3.

import java.util.Scanner;

public class Text
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод строки
        System.out.print(" Input the text: ");
        String inputString = scanner.nextLine();

        // Ввод количества повторений
        System.out.print(" Input the number of repetitions: ");
        int repetitions = scanner.nextInt();

        // Вывод строки нужное количество раз
        int count = 0;
        while (count < repetitions) {
            System.out.print(inputString + " ");
            count++; // count = count + 1; циклы увеличиваются

      } // end of cycle

    } // end of main

} // end of class