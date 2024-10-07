package homework_17.HW.repetition;

// По данному числу n закончите фразу “На лугу пасется...” одним из возможных продолжений: “n коров“, “n корова“, “n коровы“, правильно склоняя слово “корова“.
// Входные данные: Дано целое положительное число n (n <= 10),
// Выходные данные: Программа должна вывести введенное число n и одно из слов: коров, корова или коровы, например, 1 корова, 2 коровы, 5 коров.

import java.util.Scanner;

public class Cows {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Ввод числа n:
        System.out.println( "Enter the number of cows (1-10) : " );

        int n = scanner.nextInt();

        // Определяем правильное склонение слова "корова":
        java.lang.String result;
        if(n == 1){
            result = n + " корова";                         // "1 корова"
        } else if (n >=2 && n <=4) {
            result = n + " коровы";                        // "2 коровы", "3 коровы", "4 коровы"
        }else{
            result = n + " коров";                         // "5 коров", "6 коров" ... -> 10 коров
        }
        System.out.println( " На лугу пасутся " + result + ".");

        } // end of main
    } // end of class
