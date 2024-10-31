package homework_36;

import java.util.Random;
// Дополните метод bubbleSort() счетчиком, который позволяет узнать, сколько операций было выполнено по ходу сортировки. Выполните сортировку элементов массивов, в которых содержатся 10, 100 и 1000 элементов. Массивы заполните случайными целыми числами в интервале от 0 до 1000. Как растет количество операций при сортировке при росте количества элементов массива?

public class BubbleSortWithCounter {
    public static void main(String[] args) {

        int[] arraySizes = {10,100,1000};
        Random random = new Random();
        for (int currentSize : arraySizes) {
            int [] randomArray = new int[currentSize];
            for (int i = 0; i < currentSize; i++) {
                randomArray[i] = random.nextInt(1001);
            }

            int count = bubbleSortWithCounter(randomArray);
            System.out.println("Array size: " + currentSize + ", operations: " + count);
        }
    } // end of main


    public static int bubbleSortWithCounter(int[] array) {

        int count = 0;
        int n = array.length;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {

                count++;
                if (array[j] > array[j + 1]) {
                    // swapping
                    int temp = array[j];
                    array[j] = array[j + 1]; // элементы поменялись местами
                    array[j + 1] = temp;

                }
            }
        }
        return count;

    } // end of method

} // end of class