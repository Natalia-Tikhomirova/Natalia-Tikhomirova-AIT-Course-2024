package homework_43.numbers;
// Имеется набор целых чисел: 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20.
// Требуется из этого списка отобрать только простые числа. Используйте методы stream()

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PrimeNumbers {
    public static void main(String[] args) {

        // Stream<Integer> primeNumbers = Stream.of(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20).filter(n -> isPrime(n));

        List<Integer> numbers = Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        List<Integer> primeNumbers = numbers.stream()
                .filter(PrimeNumbers::isPrime)
                .toList();
        System.out.println("Prime numbers: " + primeNumbers);
    }

    private static boolean isPrime(int number) {
        if(number <= 1 ){
            return false;
        }
        return IntStream.range(2,number)
                .noneMatch(div -> number % div == 0);
    }
} // end of class
