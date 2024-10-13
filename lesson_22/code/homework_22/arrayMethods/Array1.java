package homework_22.arrayMethods;

// Реализуйте в классе ArrayMethods следующие методы для массивов целых чисел:
// - сумма всех элементов массива с нечетными индексами;
// - поиск 5-го элемента в массиве. Разработайте тесты для этих методов.

import java.util.Arrays;

public class Array1 {
    private  int[] array;

    public Array1(int[] array) {
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
        return "Array1{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public int sumOfElementsOddIndexes(){
        int sum = 0;
        for (int i = 1; i < array.length; i+=2) {
            sum+=array[i];
        } // end of for
        return sum;
    } // end of method

    public int  fifthElement(){
        if (array.length >= 5) {
                return array[4];
            }
        return -1;
    } // end of method

} // end of class