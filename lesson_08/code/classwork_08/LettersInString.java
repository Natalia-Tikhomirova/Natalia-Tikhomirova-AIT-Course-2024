package classwork_08;

// Пользователь вводит с клавиатуры строку.
//Распечатайте каждую букву строки на новой строчке.
//Используйте методы length и charAt() класса String.

import java.util.Scanner;

public class LettersInString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input string: ");
        String str = scanner.nextLine(); // тип, имя переменной (s, str,stroka - все кроме зарезервированного слова string)

        System.out.println(str);  // имя переменной без ""

        int l = str.length();           // тип, класс: принимает последовательность символов ( l - длина строки )
                                        // помещаем в переменную с типом int
        System.out.println(l);
        int i = 0;

        // Natalia
        // 01234567 - первый символ и следующие

        while ( i < l){           // вводим параметр i, задаем его ДО цикла

            System.out.println(str.charAt(i)); // i - это наш символ (ln - выводит вертикально, без него - горизонтально)
            i++; // параметр увеличивается каждый раз на 1, i = i + 1

        } // end of cycle

    } // end of main


} // end of class
