package classwork_07;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // приглашение пользователю:
        System.out.println(" Input number of month, pls: ");
        int choice = scanner.nextInt();

        switch (choice){

            case 1 -> System.out.println( "This is January");
            case 2-> System.out.println( "This is February");
            case 3 -> System.out.println( "This is March");
            //case 4 -> System.out.println( "This is April");
            //case 5 -> System.out.println( "This is May");
           // case 6 -> System.out.println( "This is Juny");
            //case 7 -> System.out.println( "This is January");
           // case 8 -> System.out.println( "This is January");
            //case 9 -> System.out.println( "This is January");
            //case 10 -> System.out.println( "This is January");
            //case 11 -> System.out.println( "This is January");
            //case 12 -> System.out.println( "This is January");



        } //end of switch

    } // end of main

} // end of class
