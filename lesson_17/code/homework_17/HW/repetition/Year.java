package homework_17.HW.repetition;

// Написать программу, определяющую, является ли год високосным. Значение года задается в программе или вводится пользователем с клавиатуры.
// Для того чтобы год был високосным, он должен: делится без остатка на 4 и, либо не должен делится без остатка на 100, либо если он делится на 100, то он должен делится также на 400. Проверить на годах 1700, 1800, 1900 - не високосные, а 2000 високосный.

import java.util.Scanner;


public class Year {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println( " Please enter the year: ");
        int year = scanner.nextInt();

        // Проверяем год, введенный пользователем:
        checkYear(year);

        // Проверка на года 1700, 1800, 1900 и 2000:
        System.out.println("\nПроверка специальных годов:");
        checkYear(1700);
        checkYear(1800);
        checkYear(1900);
        checkYear(2000);

    } // end of main

    // Метод для проверки года:
    private static void checkYear (int year){
        boolean isLeapYear = ( year % 4 == 0 && year % 100!= 0 ) || (year % 100 ==0 && year % 400 == 0);
        if (isLeapYear){
            System.out.println( year + " : високосный год. ");
        }else{
            System.out.println( year + " : не високосный год. ");
        }

    } // end of method

} // end of class
