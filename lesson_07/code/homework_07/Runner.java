package homework_07;

// В первый день спортсмен пробежал s километров, а затем он каждый день увеличивал пробег на 10 %
// от предыдущего значения.
// Определите номер того дня, на который пробег спортсмена составит не менее target километров.
// Программа получает на вход действительные числа s и target и должна вывести одно натуральное число.

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод начального пробега и цели
        System.out.print("Input the number of kilometers on the first day : " );
        double s = scanner.nextDouble();

        System.out.print("Target : ");
        double target = scanner.nextDouble();

        // Переменная для отслеживания текущего пробега
        double currentDistance = s;
        int day = 1; // Номер дня

        // Цикл увеличения пробега на 10% каждый день до достижения цели
        while (currentDistance < target) {
            currentDistance = currentDistance + ( currentDistance * 0.1 ); // Увеличение на 10%
            day++; // day = day + 1
        }

        // Вывод номера дня
        System.out.println(day);
    }
}

