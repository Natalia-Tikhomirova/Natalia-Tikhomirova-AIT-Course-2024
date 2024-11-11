package classwork_43.stream_primitives;

// Стримы примитивов Integer, Long, Double
//- получить случайные целые числа в интервале от min = 1 до max = 10 в нужном количестве
//- получение простейших статистических данных с помощью summaryStatistics
//- моделирование лотереи 6 из 49

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class PrimitiveStreamExample {

    private static final int MIN = 1;
    private static final int MAX = 10;
    private static final int N_NUMBERS = 20;

    public static void main(String[] args) {

        Stream<Integer> numbers = getRandomNumbers(MIN,MAX+1,N_NUMBERS);

       // numbers.forEach(System.out::println);
       //numbers.forEach(n -> System.out.print(n + " "));

//        numbers.forEach(number ->
//                System.out.print(String.format(" %d", number)));

        System.out.println("________________________sum of numbers_______________________");
        int sum = numbers.mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum = " + sum);

    }

    private static Stream<Integer> getRandomNumbers(int min, int max, int nNumbers) {

        return new Random()
                .ints(nNumbers,min,max) // возвращает Stream<Integer> (генерирует случ числа)
                .boxed();

    }



} // end of class
