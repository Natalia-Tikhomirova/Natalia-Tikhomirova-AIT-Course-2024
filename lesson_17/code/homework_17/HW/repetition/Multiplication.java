package homework_17.HW.repetition;

// С помощью цикла while написать программу, выводящую на экран результат умножения данного натурального числа n на все целые числа от 0 до n.
//Пример: для числа 3 результат будет 0, 3, 6, 9.
//А затем подсчитать сумму всех натуральных чисел от 0 до n.

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println( " Input number n: ");
        int n = scanner.nextInt();

        int x = 0;                                            // Счетчик для цикла
        int sum = 0;                                          // Для хранения суммы всех чисел от 0 до n
        System.out.println("Результат умножения числа " + n + " на все числа от 0 до " + n + ":");

        // Цикл для умножения числа n на числа от 0 до n:
        while ( x <= n){
            int res = n * x;                                   // Умножаем n на x
            System.out.println(n + " * " + x + " = " + res);
            sum+=x;                                           // Добавляем текущее значение x к сумме
                                                              // sum = sum + x;
            x++;                                              // Увеличиваем счетчик x
        } // end of while

        System.out.println(" Сумма всех чисел от 0 до " + n + " = " + sum);

    } // end of main
} // end of class
