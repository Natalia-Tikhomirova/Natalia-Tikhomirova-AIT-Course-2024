package array_methods;


public class ArrayMethods {

   // turn around, reverse
// step 1 - method swap
    public static void swap (int [] array,int i, int j){

        int temp = array[i]; // отложили длмент масива по индексу i
        array [i] = array [j]; // затираем переменную i на переменную j
        array[j] = temp;
    }
    // step 2 - reverse array

public static void reverseArray(int [] array) {

    for (int i = 0, j=array.length - 1; i < j; i++, j--) {
        swap(array,i,j);
    }
}

//_________________________________________________________________________________________________//
// bubble sort
    // - сравниваем всегда 2 соседних элемента, переставляем их местами, если они расположены не в порядке возрастания
    // - цикл должен идти слева направо
    // - упорядоченные элементы выключаются из цикла

    public static void bubbleSort ( int [] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j] > array[j + 1]) {      // compare 2 elements of array, if left > right => swap
                    // swapping
                    int temp = array[j];
                    array[j] = array[j + 1]; // элементы поменялись местами
                    array[j + 1] = temp;
                } // end of if
            } //  end of for 2
        }   // end of for 1
    } // end of method







// ____________________________________________________________________________________________________
    // 0 (log(n))
  // binary search
    // {50,40,30,20,10} для такого (убывающего) массива меняем < на > +6: else if (n > array [midIndex])
    // ищем 10

    public static int binarySearch (int [] array, int n){
        int leftIndex = 0;
        int rightIndex = array.length - 1;

        while (leftIndex <= rightIndex){

            int midIndex = (leftIndex + rightIndex) / 2;
            if (array[midIndex] == n){
                return  midIndex;
            }else if (n < array [midIndex]){
                rightIndex = midIndex - 1; // правую половину надо отбросить
            }else {
                 leftIndex = midIndex + 1;  // левую половину надо отбросить
            }
        } // end of while
        return -leftIndex - 1; // если элемент не нашелся
    } // end of method


    //______________________________________________________________________________________________
    // linear search, return index ( if element absent return -1)
    //  0(n) - чем больше элементов массива, тем больше работает метод

    public static int LinearSearch (int [] array, int n){
                              // (массив и искомый элемент)

        for (int i = 0; i < array.length; i++) {
            if (array [i] == n){
                return i; // возвращаем искомый индекс (первый попавшийся); go out from method
            } // end of if
        } // end of for
        return - 1; // когда элемент не входит в массив
    } // end of method


// ======================================================================================================
    // fill array random numbers____________________________________________________________________
    // a - left border, b - right border, n - quantity
    //  - заполнение массива случайными целыми числами из интервала от a до b
    //  - печать массива целых чисел
    //  - поиск элемента

    public static int[] fillArray(int a, int b, int n) {
        int [] res = new int[n];

        for (int i = 0; i < res.length; i++) {
            res [i] = (int)(Math.random()*( b - a + 1 ) + a ); // вызываем датчик случайных чисел

        } // end of for
        return res;
    } // end of method

    // print array__________________________________________________________________________________
    public static void printArray(int[]array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        } // end of for
        System.out.println();
        System.out.println("___________________________________________________");
    } // end of method

    // search in array_________________________________________________________________________________

    public static boolean searchInArray(int[] array, int n){
        for (int i = 0; i < array.length; i++) {
            if (array [i] == n){
                return true;
            } // end of if
        } // end of for

        return  false;
    } // end of method

    // метод calculatePercent _________________________________________________________________________
    //  метод, который получает массив данных об остатках на счетах пользователей банка
    //  и возвращает их с начисленными X процентами.

    public static double [] calculatePercent (double[] balances,double percent ){
        double [] updateBalances = new double[balances.length];

        for (int i = 0; i < balances.length; i++) {

            updateBalances [i] = balances[i] + ( balances[i] * percent / 100);
        } // end of for
        return updateBalances;

    } // end of method

    // метод  printArrayDouble()____________________________________________________________________

    public static void printArrayDouble (double[] array){

        for (int i = 0; i < array.length; i++) {

            System.out.printf("%.2f ", array[i]);  // Вывод с двумя знаками после запятой

        } // end of for
        System.out.println();  // Переход на новую строку после вывода
        System.out.println("___________________________________________________");
    } // end of method

    // Метод для вычисления суммы всех элементов массива int

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];  // Суммируем элементы массива
        } // end of for
        return sum;  // Возвращаем сумму

    } // end of method

    // Метод для вычисления среднего арифметического массива double

    public static double averageValue(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];  // Суммируем элементы массива
        } // end of for
        return sum / array.length;  // Возвращаем среднее арифметическое
    } // end of method


} // end of class




