package homework_43.numbers;
// Имеется набор целых чисел: 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20.
// Требуется из этого списка отобрать только простые числа. Используйте методы stream()

import java.util.Arrays;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        List<Integer> primeNumbers = numbers.stream()
                .filter(PrimeNumbers::isPrime)
                .toList();
        System.out.println("Prime numbers: " + primeNumbers);
    }

    private static boolean isPrime(int number) {

        if (number <= 1) {
            return false;                      // 1 и меньше не являются простыми
        }
        for (int div = 2; div < number; div++) {
            if (number % div == 0) {
                return false;                  // Число делится на div, значит, оно не простое
            }
        }
        return true;                           // Число простое
    }

} // end of class
