package classwork_20.wrapper_classes_examples;

import java.math.BigInteger;

public class WrapperClassAppl {

    public static void main(String[] args) {

        int k = 1234567890; // в стеке
        System.out.println(k);
        System.out.println("______________________________________________________________");

        Integer integer = Integer.parseInt("1234567890"); // класс, создающий объекты (parseInt вытаскивает число из строки)
        System.out.println(integer);
        integer = integer + 15; // 5 - int
        System.out.println(integer);

        // автоупаковка
        Integer x = 5;
        System.out.println(x * 10);

        // автораспаковка
        integer = 7;
        int z = x + integer;
        System.out.println(z);

        System.out.println("______________________________________________________________");

        BigInteger myBigInteger = new BigInteger("12345678901234567890");
        System.out.println(myBigInteger);

        // кол-во цифр в числе, 2-я версия решения
        int b = 1234567890;
        Integer bInt = b; // упаковали символы в строку: int в Integer

        // смена типа
        String str = bInt.toString(); // сменили числу тип на String
        int l = str.length();           // посчитали длину строки

        System.out.println("Number: " + b + " contains " + l + " digits.");

        System.out.println("______________________________________________________________");
        System.out.println("Max value of int: " + bInt.MAX_VALUE);
        System.out.println("Min value of int: " + bInt.MIN_VALUE);

        Double d = 0.0;
        System.out.println("Max value of double: " + d.MAX_VALUE);
        System.out.println("Min value of double: " + d.MIN_VALUE);

        System.out.println("______________________________________________________________");
        // математические вычисления

        int n = 20;
        Integer m = 10;

        m = m + n; // m стало 30
        System.out.println(m);
        n = n + m; // 20 + 30
        System.out.println(n + 1);

        Double pi = 3.14;
        double circleLength = 2 * pi * 10;
        System.out.println(circleLength);

        System.out.printf(" Length of circle: %.2f ", circleLength);
        System.out.println();

        System.out.println("______________________________________________________________");
        // NaN и Infinite

        double p = 20/ 0.0; // Double p = 20/ 0.0;
        // после точек ставим методы, с большой буквы пишем обертку класса
        if(Double.isNaN(p) || Double.isInfinite(p)){
            System.out.println(" Wrong operation, division by Zero");
        }else System.out.println(p);

        System.out.println("______________________________________________________________");
        // Перевод String в число

        String str1 = "0098765432100"; // имя объекта типа String
        long num = Long.parseLong(str1);// нужно получить число
        System.out.println(num);

    } // end of main
} // end of class
