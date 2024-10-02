package homework_08;

 // Распечатайте все натуральные числа меньшие 200 и кратные 13. Используйте циклы while и do while.

public class PrintNumbersOf13 {
    public static void main(String[] args) {

        int number = 13; // первое число, кратное 13
        System.out.println("Числа, кратные 13 :");

        while (number < 200) {
            System.out.print(number + " , ");
            number = number + 13; //  number += 13: Увеличиваем на 13 для получения следующего кратного

        } // end of cicle

        // ИЛИ:

        do {
            System.out.println(number); // вводим число
            number += 13;               // Увеличиваем на 13 для получения следующего кратного
        } while (number < 200);         // пока числа < 200


    } // end of main

} // end of class
