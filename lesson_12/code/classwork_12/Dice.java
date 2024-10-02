package classwork_12;

// Смоделируйте бросок игрального кубика 20 раз. -> задаем массив
// Подсчитайте, сколько раз выпала каждая грань?
// int sum = 0;
//
//for (int j = 1; j <= 6; j++)
//{
//    for (int i = 0; i < toss.length-1; i++)
//{
//    if (toss[i] == j) sum ++;
//}
//    System.out.println(j + " = " + sum);
//    sum = 0;
//}

// Проверьте, равны ли вероятности выпадений граней кубика? resultat /  кол-во бросков

import java.util.Random;

public class Dice {

    public static void main(String[] args) {

        Random random = new Random(); // создали генератор (датчик) случайных чисел

        int [] toss = new int[20];

        // fill in
        for (int i = 0; i < toss.length; i++) {
            // вызов генератора (датчика) случайных чисел
            int n = random.nextInt(6) + 1; // диапазон от 0 до 5 вкл., +1, чтобы сдвинуть от 1 до 6
            toss [i] = n;
            System.out.print( n + "  ");
        }
        System.out.println();

        //calculate results of tossing

        // ск. раз выпала та или иная грань (посчитать для КАЖДОЙ грани):
        // 1. сделать 6 (кол-во граней) циклов if
        // 2.

        int[] res = new int[6]; // array of results
        for (int i = 0; i < toss.length; i++) {
            int n = toss[i];
            switch (n){
                case 1  -> res[0]++;
                case 2  -> res[1]++;
                case 3  -> res[2]++;
                case 4  -> res[3]++;
                case 5  -> res[4]++;
                case 6  -> res[5]++;
            }
        }

        // print res
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

    } // end of main
}
