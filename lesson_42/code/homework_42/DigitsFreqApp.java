package homework_42;

// сгенерировать один миллион положительных целых чисел в интервале от 100 до 1000, и подсчитать частоту встречаемости цифр в этих числах.

import java.util.*;

public class DigitsFreqApp {
    public static void main(String[] args) {

        Random random = new Random();

        Map<Integer,Integer> digitFreg = new HashMap<>();

        // заполняем карту частот нулями для цифр от 0 до 9
        for (int i = 0; i <=9; i++) {
            digitFreg.put(i,0);
        }

        // генерируем миллион чисел и подсчет частоты каждой цифры

        for (int i = 0; i < 1_000_000; i++) {
            int number = random.nextInt(901) + 100;
            // разделяем числа на отдельные цифры и обновляем частоту каждой цифры

            while (number > 0){
                int digit = number % 10;
                digitFreg.put(digit,digitFreg.getOrDefault(digit,0) +1);
                number /=10;
            }
        }
        System.out.println("Частота встречаемости цифр:");
        for (Map.Entry<Integer, Integer> entry : digitFreg.entrySet()) {
            System.out.printf("Цифра %d: %d раз%n", entry.getKey(), entry.getValue());
        }
    }
} // end of class

