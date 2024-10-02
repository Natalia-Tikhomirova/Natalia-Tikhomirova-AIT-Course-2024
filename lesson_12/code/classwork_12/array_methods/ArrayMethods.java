package classwork_12.array_methods;

//  - заполнение массива случайными целыми числами из интервала от a до b
//  - печать массива целых чисел
//  - поиск элемента

public class ArrayMethods {

    // fill array random numbers____________________________________________________________________
    // a - left border, b - right border, n - quantity

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




