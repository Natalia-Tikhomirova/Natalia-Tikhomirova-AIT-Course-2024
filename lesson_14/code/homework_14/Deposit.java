package homework_14;

// В сберкассу на трёхпроцентный вклад положили s рублей.
// Какой станет сумма вклада через n лет. Использовать цикл for.

import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {

        // Вводим начальные данные:
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Введите начальную сумму вклада (рубли): " );
        double s = scanner.nextInt();

        System.out.print("Введите количество лет: ");
        int years = scanner.nextInt();

        double interesRate = 0.03;                              // Процентная ставка 3% (в виде десятичной дроби)

        // Рассчитываем сумму вклада через n лет:
        double depositAmount = s;                               // Изначально сумма равна начальной сумме вклада
        for (int i = 1; i <=years ; i++) {
            depositAmount += depositAmount * interesRate;       // Начисляем проценты за год
        } // end of for

        // Выводим конечную сумму вклада:
        System.out.println("Сумма вклада через " + years + " лет: " + depositAmount + " рублей");

    } // end of main
} // end of class
