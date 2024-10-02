package homework_11;

// У стрелка есть 10 попыток поразить мишень.
// Смоделируйте 10 выстрелов с помощью датчика случайных чисел.
// Ответьте на вопрос, сколько очков набрал стрелок?
// Попал ли он хоть раз в центр мишени? -> true - false = boolean

import java.util.Random;

public class MyShooter {

    public static void main(String[] args) {

        int [] shot = new int[10]; // создаем массив из 10 случайных чисел (выстрелов)
        Random random = new Random(); // создаем генератор случайных чисел

        for (int i = 0; i < shot.length; i++) {

            shot[i] = random.nextInt(11);  // случайное число в диапазоне от 0 до 10 (включительно)

            System.out.print(shot [i] +  "  "); // выводим массив на печать
        } // end of for

        System.out.println(); // переходим на новую строку

        // находим сумму очков

        int sum = 0;

        for (int i = 0; i < shot.length; i++) {

            sum += shot [i]; // sum = sum + shot [i]
        } // end of for

        System.out.println( " Summa = " + sum );

        boolean apple = true; // ищем попадание в центр мишени

        for (int i = 0; i < shot.length; i++) {

            if ( shot [i] == 10) {
                apple = true;
            } // end of if
        } // end of for

        System.out.print( " Hit the apple: " + true); // выводим на печать попал или нет, когда попадается 10
    } // end of main
} // end of class
