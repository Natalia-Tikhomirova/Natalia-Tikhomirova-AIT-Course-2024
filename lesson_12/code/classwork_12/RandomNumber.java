package classwork_12;

//Задайте массив из 10 случайных натуральных чисел в интервале от 1 до 100.
//Запросите у пользователя какое-то натуральное число.
//Определите, есть ли это число в массиве.
//Создайте и используйте метод searchInArray, который получает на вход массив и искомое число, а возвращает
//ответ - нашлось ли это число в массиве.

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {

        int[] numbers = new int[10]; // Создаем массив из 10 случайных целых чисел
        Random random = new Random(); // создание генератора случайных чисел

         // fill in array numbers
        for (int i = 0; i < numbers.length; i++) {
             numbers[i] = random.nextInt(100) + 1;  // случайное число в интервале от 1 до 100.
            // если в скобках будет просто 100, то интервал будет от 0 до 100.
        }// end of for

       // print array numbers

        printArray(numbers);

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input positive integer number: "); // ввод числа пользователем
        int n = scanner.nextInt(); //

        boolean isInArray = searchInArray(numbers, n); //  вызов метода (ставим курсор на имя метода и нажимаем ALT + Enter)
                                                       //  метод автоматом создастся в методе
        System.out.println( " Number " + n + " is in array " + isInArray);


    } // end of main

    private static boolean searchInArray(int[] numbers, int n) {

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == n){
                return  true;
            } // end of if
        } // end of for

        return false;
    } // end of method

    private static void printArray(int[]array){

        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i] + " ");
        } // end of for

        System.out.println( " ");
        System.out.println("________________________________________");

    } // end of method

 } // end of class
