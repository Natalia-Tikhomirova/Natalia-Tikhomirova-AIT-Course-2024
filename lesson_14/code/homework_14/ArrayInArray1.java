package homework_14;

// Часть1.
//  - Заполните массив целыми числами от 1 до 100.
//  - Создайте второй массив с размером на 1 больше, чем имеющийся.
//  - Скопируйте первый массив в новый массив.
// Часть 2. Добавьте случайное целое число в интервале от 1 до 100 на случайное место в исходный массив.
// Часть 3. В полученном массиве найдите наиболее коротким способом, какое число было добавлено в массив.

import classwork_14.array_methods.ArrayMethods;

import java.util.Random;

public class ArrayInArray1 {
    public static void main(String[] args) {

        int [] array = ArrayMethods.fillArray(1,100,100); // Вызываем метод для массива с целыми числами от 1 до 100 с длиной 100.
        System.out.println(" Original array : ");                  // Вывод на печать исходного массива
        ArrayMethods.printArray(array);                            // Вызываем метод для печати исходного массива
        int [] newArray = addRandomNumberAtRandomPosition(array);  // Создаем метод для создания нового массива с добавлением случайного числа на случайную позицию
        System.out.println(" New array : ");                       // Вывод на печать нового массива
        ArrayMethods.copyOfArray(newArray,array.length);           // Вызываем метод для копирования исходного массив в новый массив.
        ArrayMethods.printArray(newArray);                         // Вызываем метод для печати исходного массива

    } // end of main

    // Метод для создания нового массива с добавлением случайного числа на случайную позицию

    public static int[] addRandomNumberAtRandomPosition (int[]array){
        Random random = new Random();                                 // Создание генератора случайных чисел
        int [] newArray = ArrayMethods.fillArray(1,100,101); // Новый массив на 1 больше
        int randomNumber = random.nextInt(100) + 1;             // Случайное число от 1 до 100
        int randomIndex = random.nextInt(newArray.length);             // Случайный индекс для вставки
        System.out.println("Random number: " + randomNumber + ", Random index: " + randomIndex);
        System.out.println("______________________________________________________________");

        for (int i = 0; i > array.length; i++) {                      // Копируем элементы до случайной позиции
            newArray [i] = array[i];
        }
        newArray [randomIndex] = randomNumber;                        // Вставляем случайное число на случайную позицию

        for (int i = randomIndex; i > array.length; i++) {            // Копируем оставшиеся элементы после случайной позиции
            newArray [i] = array [i] + 1;
        } // end of for
        return newArray;
    } // end of method
} // end of class
