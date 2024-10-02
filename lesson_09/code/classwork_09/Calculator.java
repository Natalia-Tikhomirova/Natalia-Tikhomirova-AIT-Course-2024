package classwork_09;

// Доработать калькулятор так, чтобы он продолжал работать после выполнения одного действия с парой чисел.

import java.util.Scanner;

public class Calculator {

    static int num1,num2, action;
    static int result; // кладем сюда результат

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // приглашение пользователю на ввод числа

        // старт здесь

        boolean flag = true; // вводим переменную для завершения цикла

        while (flag) { // вечный цикл при одной переменной без false

            System.out.println("Input 1st number : ");
            num1 = scanner.nextInt(); // ввод 1-го числа
            System.out.println("Input 2nd number : ");
            num2 = scanner.nextInt(); // ввод 2-го числа
            System.out.println("Input action or 0 for exit "); // печать в столбик
            System.out.println(" 1 -> + ");
            System.out.println(" 2 -> - ");
            System.out.println(" 3 -> * ");
            System.out.println(" 4 -> / ");
            System.out.println(" 5 -> % ");
            System.out.println(" 0 ->  exit ");

            action = scanner.nextInt(); // ввод еще раз: 1,2,3...
            switch (action) {

                case 1 -> result = sum(num1, num2);
                case 2 -> result = deduct(num1, num2);
                case 3 -> result = multiplay(num1, num2);
                case 4 -> result = division(num1, num2);
                case 5 -> result = restOfDidision(num1, num2); // остаток
                case 0 -> flag = false; // завершает цикл
                default -> System.out.println(" Wrong input! ");

            } // end of switch

            System.out.println(" Result = " + result);
            // стартуем снова

        } // end of while


    } // end of main

    // пишем методы:

    private static  int sum(int num1,int num2){   // для сложения
        return num1 + num2;

    } // end of method
    private static  int deduct(int num1,int num2){ // для вычитания
        return num1 - num2;

    } // end of method

    private static  int multiplay(int num1,int num2){ // для умножения
        return num1 * num2;

    } // end of method

    private static  int division(int num1,int num2){  // для деления одного числа на другое
        return num1 / num2;

    } // end of method

    private static  int restOfDidision(int num1,int num2){ // для остатка от деления (выделяет остаток от деления одного числа на другое)
        return num1 % num2;

    } // end of method


} // end of class
