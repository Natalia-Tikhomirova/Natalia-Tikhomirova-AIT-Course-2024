package homework_10;

// Создайте массив из 20 случайных(*) целых чисел в интервале от 10 до 30.
// Выведите массив на печать.
// Поменяйте местами первый и последний элементы массива и снова выведите массив на печать.

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        // Создаем массив из 20 случайных целых чисел в интервале от 10 до 30
        int[] array = new int[20];
        Random random = new Random(); // создание генератора случайных чисел

        for (int i = 0; i < array.length; i++) {
            array[i] = 10 + random.nextInt (21); // случайное число в диапазоне от 10 до 30 (включительно)
        } // random.nextInt(21) генерирует случайное целое число от 0 до 20.

        // Выводим исходный массив на печать
        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println(); // Переход на новую строку

        // Меняем местами первый и последний элементы массива
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;

        // Выводим измененный массив на печать
        System.out.println("Массив после замены первого и последнего элемента:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
