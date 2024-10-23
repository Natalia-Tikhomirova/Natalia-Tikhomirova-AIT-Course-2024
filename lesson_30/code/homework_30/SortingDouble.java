package homework_30;

// Создайте массив действительных чисел на базе класса-обертки Double на 10 элементов, заполните его случайными числами в интервале от 0 до 10. Выполните сортировки:

// ascending; - по возрастанию
// descending. - по убыванию

import java.util.Arrays;
import java.util.Random;

import static classwork_12.array_methods.ArrayMethods.printArray;

public class SortingDouble {
    public static void main(String[] args) {

        Double[] numbers = new Double[10];

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextDouble(0,10);
        }

        System.out.println("Array before sorting:" + Arrays.toString(numbers));

        // ascending
        Arrays.sort(numbers,(n1,n2) -> Double.compare(n1,n2));
        System.out.println("Array after sorting by ascending :" + Arrays.toString(numbers));

        System.out.println("===============================================================");

        // descending
        Arrays.sort(numbers,(n2,n1) -> Double.compare(n2,n1));
        System.out.println("Array after sorting by descending :" + Arrays.toString(numbers));

    }
} // end of class
