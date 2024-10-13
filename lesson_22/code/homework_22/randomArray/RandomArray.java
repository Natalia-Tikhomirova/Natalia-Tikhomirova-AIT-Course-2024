package homework_22.randomArray;

// Создайте массив из 100 случайных целых чисел в интервале от -10 до 10. Подсчитайте, сколько в этом массиве оказалось:
// - положительных чисел;
// - отрицательных чисел;
// - четных чисел;
// - нулей.
// Реализуйте все подсчеты методами и напишите для них тесты.

import java.util.Arrays;
import java.util.Random;

import static classwork_12.array_methods.ArrayMethods.printArray;

public class RandomArray {
     private int[] array;
     private Random random;

    public RandomArray() {
        this.array = new int[100];
        this.random = new Random();
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    @Override
    public String toString() {
        return "RandomArray{" +
                "array=" + Arrays.toString(array) +
                ", random=" + random +
                '}';
    }

    // fill array
    public void fillArray(){
        for (int i = 0; i <array.length; i++) {
            array[i] = random.nextInt(21) - 10;
        } // end of for
        printArray(array);
    } // end of method


    // count positive numbers in array
    public int countPositive(){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0){
                count++;
            }
        } // end of for
        return count;
    } // end of method

   // count negative numbers in array
    public int countNegative(){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0){
                count++;        }
        } // end of for
        return count;
    } // end of method

    // count even numbers
    public int countEven(){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                count++;
            }
        }  // end of for
        return count;
    } // end of method

    // count zero numbers
    public int countZero(){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0){
                count++;
            }
        } // end of for
        return count;
    } // end of method

    public int sumOfCounts(){
       return countPositive() + countNegative() + countZero();
    } // end of method

} // end of class



