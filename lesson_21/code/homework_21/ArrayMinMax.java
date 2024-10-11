package homework_21;

import java.util.Arrays;
import java.util.Objects;

public class ArrayMinMax {

    private int [] array;

    // constructor

    public ArrayMinMax(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "ArrayMinMax{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArrayMinMax that)) return false;
        return Objects.deepEquals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    // Метод для поиска индекса минимального значения в массиве:
    public int MinIndexOfArray(int[]array)  {

        if(array == null || array.length == 0){
            return -1;                                       // Индикатор, что массив пуст или null
        }
        int minOfArray = array[0];
        int indexOfMinElement = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minOfArray) {
                minOfArray = array[i];
                indexOfMinElement = i;
            }
        } // end of for
        System.out.println( " Index of min element = " + indexOfMinElement);
        return indexOfMinElement;
    } // end of method

    // Метод для поиска индекса максимального значения в массиве:
    public int MaxIndexOfArray (int[]array)  {
        if(array == null || array.length == 0){
            return  -1;                                     // Индикатор, что массив пуст или null
        }
        int maxOfArray = array[0];
        int indexOfMaxElement = 0;

        for (int i = 1; i < array.length; i++) {
            if(array[i] > maxOfArray){
                maxOfArray = array[i];
                indexOfMaxElement = i;
            }
        } // end of for
        System.out.println( " Index of max element = " + indexOfMaxElement);
        return indexOfMaxElement;

    } // end of method

    // Метод для поиска минимального значения в массиве:
    public int MinOfArray(int[]array)  {

        if(array == null || array.length == 0){
            return Integer.MAX_VALUE;
        }
        int minOfArray = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minOfArray) {
                minOfArray = array[i];
            }
        } // end of for
        System.out.println( " Min element of array = " + minOfArray  );
        return minOfArray;
    } // end of method

    // Метод для поиска максимального значения в массиве:
    public int MaxOfArray (int[]array)  {
        if(array == null || array.length == 0){
            return  Integer.MIN_VALUE;
        }
        int maxOfArray = array[0];

        for (int i = 1; i < array.length; i++) {
            if(array[i] > maxOfArray){
                maxOfArray = array[i];
            }
        } // end of for
        System.out.println( " Max element of array = " + maxOfArray  );
        return maxOfArray;

    } // end of method

} // end of class
