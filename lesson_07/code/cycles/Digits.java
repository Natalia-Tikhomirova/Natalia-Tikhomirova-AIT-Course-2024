package cycles;

// Пользователь вводит натуральное число (целое, положительное).
// Выясните, сколько цифр в числе.

import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {


        // 5 467
        // 5 467 % 10 = 7 (остаток) - первая цифра числа
        // 5467 / 10 = 546 (целая часть)
        // продолжим в цикле / 10 пока результат > 0


        Scanner scanner = new Scanner(System.in); //  пользователь вводит число
        System.out.println( "Input positive integer number: ");
        int number = scanner.nextInt();
        int temp = number;

        int count = 0; // счетчик

        while (number > 0 ){

            number = number / 10; // number - параметр цикла
            System.out.println( number);
            count++;



        } // end of cycle

        System.out.println( " Digits number " + temp + " are = " + count);


    } // end of main


} // end of class
