package array_methods;

import classwork_12.array_methods.ArrayMethods;

import java.util.Scanner;

public class ArrayMethodsAppl {

    public static void main(String[] args) {

        // create array with random numbers
        int [] myArray2 = classwork_12.array_methods.ArrayMethods.fillArray(0,100,10);

        // print array

        ArrayMethods.printArray(myArray2);

        // sort array
        array_methods.ArrayMethods.bubbleSort(myArray2);


        // print array
        ArrayMethods.printArray(myArray2);

        int [] newArray3 = array_methods.ArrayMethods.fillArray(1,20,6);
        ArrayMethods.printArray(newArray3);
        array_methods.ArrayMethods.reverseArray(newArray3);






//__________________________________________________________________________________________________________
         int [] myArray1 = {10,20,30,40,50};
        System.out.println(array_methods.ArrayMethods.LinearSearch (myArray1, 10));// вызываем линейный метод
        System.out.println(array_methods.ArrayMethods.LinearSearch(myArray1, 100));// вызываем линейный метод

        System.out.println("__________________________________________________________");

        int index = array_methods.ArrayMethods.binarySearch(myArray1,50); // вызываем бинарный метод
        System.out.println(index);


        System.out.println("__________________________________________________________");


        //==============================================================================================
        // Test averageValue
        double average = classwork_12.array_methods.ArrayMethods.averageValue(new double[]{12,15,16,45,91});
        System.out.println("Среднее арифметическое элементов массива double: " + average);

        double[] doubleArray = {1,2,3,4,5,12,0,1};
        System.out.println(array_methods.ArrayMethods.averageValue(doubleArray));
        System.out.println("_________________________________________________________");


        // Test sumArray
        int [] intArray = {1,2,3,4,5,13};
        array_methods.ArrayMethods.sumArray(intArray);
        System.out.print(array_methods.ArrayMethods.sumArray(intArray));

        System.out.println();

        int sum = classwork_12.array_methods.ArrayMethods.sumArray(new int[]{1,2,3,4,5,13});
        System.out.print("Сумма элементов массива int: " + sum);
        System.out.println();

        System.out.println("_________________________________________________________________");

        // данные из массива intArray перенести в doubleArray

        for (int i = 0; i < intArray.length; i++) {

            doubleArray [i] = intArray[i];
            System.out.print(doubleArray[i] + " ");
        }

        System.out.println();

        System.out.println("_________________________________________________________");

        // Test  calculatePercent

        double [] balances = classwork_12.array_methods.ArrayMethods.calculatePercent(new double[]{1000.0, 1500.5, 2000.75, 250.25, 500.0}, 5);
        System.out.println("Остатки на счетах после начисления %  :");
        classwork_12.array_methods.ArrayMethods.printArrayDouble(balances); // вызываем метод calculatePercent

        //____________________________________________________________________________________________
         // чтобы заработали другие методы, нужно отработать этот метод, введя запрашиваемый номер

        int [] myArray = classwork_12.array_methods.ArrayMethods.fillArray(- 10,20,30); // вызываем метод, который лежит в классе ArrayMethodsAppl

        classwork_12.array_methods.ArrayMethods.printArray(myArray); // распечатываем метод с именем myArray

        Scanner scanner = new Scanner(System.in);
        System.out.println( "Input number of searching: ");
        int n = scanner.nextInt();

        boolean isInArray = ArrayMethods.searchInArray(myArray,n);
        System.out.println( " Number " + n + " is in array: " + isInArray);


           } // end of main

} // end of class
