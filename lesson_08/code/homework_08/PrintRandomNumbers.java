package homework_08;

//

import java.util.Scanner;

public class PrintRandomNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input random number :");
        int startNumber = scanner.nextInt();  // Ввод любого числа

        // Находим первое кратное 13 число, не меньшее введенного
        int number = startNumber;
        while (number % 13 != 0) {
            number++;
        }

        // Вывод всех кратных 13 чисел, которые меньше 200
        System.out.println("Числа, кратные 13 и меньше 200 :");
        while (number < 200) {
            System.out.println(number);
            number += 13;  // Увеличиваем на 13 для получения следующего кратного числа
        }

    }
}
