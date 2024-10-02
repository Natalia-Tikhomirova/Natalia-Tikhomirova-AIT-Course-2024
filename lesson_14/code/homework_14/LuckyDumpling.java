package homework_14;

// Задача про поиск "счастливого пельменя". Хозяйка налепила для гостей 30 пельменей.
// В один из пельменей она положила монету, которая увеличивает вес пельменя на 15 грамм.
// Напишите программу, которая ищет счастливый пельмень.

import classwork_14.array_methods.ArrayMethods;

import java.util.Random;

public class LuckyDumpling {

    public static void main(String[] args) {

        int [] dumpling = new int [30];                           // Создание массива на 30 элементов
        Random random = new Random();                             // Создание генератора случайных чисел

        dumpling = ArrayMethods.fillArray(20, 30, 30);  // Задаем вес 30 пельменей без монеты
        System.out.println(" Weight dumplings without coin : "); // Распечатываем вес 30 пельменей
        ArrayMethods.printArray(dumpling);

        // Случайно выбираем один пельмень и увеличиваем его вес на 15 грамм:
        int LuckyDumpling = random.nextInt(dumpling.length);    // Случайный индекс пельменя
        dumpling[LuckyDumpling] += 15;                          // добавляем 15 грамм к весу выбранного пельменя

        System.out.println( " Weight dumplings with coin :  "); // Выводим вес пельменей после изменения
        ArrayMethods.printArray(dumpling);
        // Показываем, в каком пельмене находится монета:
        System.out.println(" Coin added to dumpling  " + (LuckyDumpling + 1) + " . ");

    } // end of main
} // end of class

