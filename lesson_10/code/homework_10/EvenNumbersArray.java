package homework_10;

// Заполнить массив четными числами от 0 до 50. 0, 2, 4, 8, ... , 42, 44, 48, 50
// Распечатать массив в порядке возрастания, затем в порядке убывания.

public class EvenNumbersArray {
    public static void main(String[] args) {

        // Создаем массив для хранения чётных чисел от 0 до 50
        int[] arr = new int[26];  // Массив на 26 элементов
        int number = 0;

        // Заполняем массив четными числами
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number;
            number += 2; // number = number +2
        }

        // Вывод массива в порядке возрастания
        System.out.println("Массив в порядке возрастания:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(" "); // переход на новую строку


        // Вывод массива в порядке убывания
        System.out.println(" Массив в порядке убывания: ");
        for (int i = arr.length - 1; i > 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }

}












