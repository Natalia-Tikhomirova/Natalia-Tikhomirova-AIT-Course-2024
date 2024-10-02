package homework_11;

// Задан массив целых чисел: 65, 37, 51, -17, 73, -41, 52, 56, -55, 83.
// Найдите максимальный элемент массива (maxOfArray) и его индекс (indexOfMaxElement).
// Поставьте этот элемент в начало массива.

public class ArrayOfIntegers {
    public static void main(String[] args) {

        int[] array = {65, 37, 51, -17, 73, -41, 52, 56, -55, 83}; // задали массив
        int maxOfArray = array[0]; // предполагаем, чтобы цикл начинал работать с первого числа
        int indexOfMaxElement = 0; // предполагаем, чтобы индекс искался с первого числа

        // запускаем цикл поиска максимального элемента массива и его индекса.

        for (int i = 0; i < array.length; i++) {

            if (array[i] > maxOfArray){
                maxOfArray = array[i];
                indexOfMaxElement = i;
            } // end of if
        } // end of for

        System.out.println( " Max element = " + maxOfArray + " ;  Index of element = " + indexOfMaxElement);

        int temp = array [0];  // создаем временную переменную
        array[0] = maxOfArray; // ставим на первое место максимальный элемент

        // Выводим массив после перемещения максимального элемента

        System.out.println( "Put the maximum 1st : " );

        for (int i = 0; i < array.length; i++) {
            System.out.print( array [i] + "   ");

        } // end of  for

    } // end of main


} // end of class