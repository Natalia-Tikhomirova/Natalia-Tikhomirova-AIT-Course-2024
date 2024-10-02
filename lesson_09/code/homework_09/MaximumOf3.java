package homework_09;

// Написать программу, выводящую на экран максимальное из трех целых чисел.
// Числа задайте самостоятельно внутри программы.
// Решите эту задачу с помощью if ... else и также с помощью тернарного оператора.

public class MaximumOf3 {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 7;

        int max;

        if ( a >= b && a >= c){
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else max = c;

        System.out.println( " Maximum =  "  + max);


    } // end of main

} // end of class
