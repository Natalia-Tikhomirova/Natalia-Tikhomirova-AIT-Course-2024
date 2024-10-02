package homework_10;

// Создайте массив из 20 случайных(*) целых чисел в интервале от 10 до 30.
// Выведите массив на печать.
// Поменяйте местами первый и последний элементы массива и снова выведите массив на печать.

public class ArrayOfNumbers {
    public static void main(String[] args) {

        int a = 10;
        int b = 30;
        int n = (int)(Math.random() * (b - a + 1) + a);
        int [] array = new int[20];



        for (int i = 0; i < array.length; i++) {
            array [i] = i + 1;
            System.out.print( " Random number : " + n);

        }

    }


}

