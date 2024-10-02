package homework_05;

// Написать метод, возвращающий минимальное из двух целых чисел. Числа задаются в программе.

public class Minimum {

    public static void main(String[] args) {

        int x = 15;
        int y = 20;

        int min = minimum (x,y);
        System.out.println( " Minimum =  " + min);

    } // end of main

    //здесь будет метод, возвращающий минимальное из двух целых чисел.

    private static int minimum (int x, int y){

        int min;

        if (x-y<0){
            min = x;

        }else {
            min = y;

        }

        return min;

    }



} // end of class
