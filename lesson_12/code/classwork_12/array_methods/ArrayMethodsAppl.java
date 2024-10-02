package classwork_12.array_methods;

import java.util.Scanner;

public class ArrayMethodsAppl {

    public static void main(String[] args) {

        // Test averageValue
        double average = ArrayMethods.averageValue(new double[]{12,15,16,45,91});
        System.out.println("Среднее арифметическое элементов массива double: " + average);
        System.out.println("_________________________________________________________");


        // Test sumArray
        int sum = ArrayMethods.sumArray(new int[]{1,2,3,4});
        System.out.println("Сумма элементов массива int: " + sum);
        System.out.println("_________________________________________________________");

        // Test  calculatePercent

        double [] balances = ArrayMethods.calculatePercent(new double[]{1000.0, 1500.5, 2000.75, 250.25, 500.0}, 5);
        System.out.println("Остатки на счетах после начисления %  :");
        ArrayMethods.printArrayDouble(balances); // вызываем метод calculatePercent

        //____________________________________________________________________________________________
         // чтобы заработали другие методы, нужно отработать этот метод, введя запрашиваемый номер

        int [] myArray = ArrayMethods.fillArray(- 10,20,30); // вызываем метод, который лежит в классе ArrayMethodsAppl

        ArrayMethods.printArray(myArray); // распечатываем метод с именем myArray

        Scanner scanner = new Scanner(System.in);
        System.out.println( "Input number of searching: ");
        int n = scanner.nextInt();

        boolean isInArray = ArrayMethods.searchInArray(myArray,n);
        System.out.println( " Number " + n + " is in array: " + isInArray);


           } // end of main

} // end of class
