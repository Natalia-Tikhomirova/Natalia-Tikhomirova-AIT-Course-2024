package homework_17.HW.repetition;

// С помощью цикла while написать программу, выводящую на экран куб числа от 1 до заданного числа n.
// Пример:для числа n = 3
// 1 в кубе 1
// 2 в кубе 8
// 3 в кубе 27

import java.util.Scanner;

public class Cube {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println( " Input number n : " );
        int number = scanner.nextInt();            // Читаем значение n, до которого будем выводить кубы

        int x = 1;                                 // Начинаем с числа 1

        while ( x <= number){                      // Пока x меньше или равно n
            int res = x * x * x;                   // Вычисляем куб
            System.out.println(  x + " ^ 3  = "  + res);
            x++;                                   // Увеличиваем i на 1

        } // end of while
    } // end of main
} // end of class
