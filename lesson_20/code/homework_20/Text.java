package homework_20;

// Разработайте приложение, которое принимает от пользователя строку (некое предложение, например: "Мама мыла раму.") и выводит:
// - количество символов в строке;
// - количество символов в верхнем регистре;
// - количество цифр в строке;
// - количество пробелов в строке (код пробела = 32);
// - в зависимости от последнего символа в строке сообщает, какое это предложение:
// - повествовательное;
// - вопросительное;
// - восклицательное.
// Используйте методы класса Character.

import java.lang.reflect.Type;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println( "Input the text: ");
        String text = scanner.nextLine();
        System.out.println("The entered text is:");
        System.out.println(text);

        // Количество символов в строке:
        int totalChars = text.length();

        // Переменные для подсчета:
        int upperCaseCount = 0;
        int digitCount = 0;
        int spaceCount = 0;

        // Цикл по всем символам строки:
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Количество символов в верхнем регистре:
            if(Character.isUpperCase(ch)){
                upperCaseCount++;
            }

            // Количество цифр в строке:
            if(Character.isDigit(ch)){
                digitCount++;
            }

            // Количество пробелов:
            if(Character.isSpaceChar(ch)){
                spaceCount++;
            }
        } // end of for

        // Определение типа предложения по последнему символу:
        char lastChar = text.charAt(text.length() - 1);
        String sentenceType; // переменная sentenceType типа String, хранит тип предложения, определяемого на основе последнего символа, введённого пользователем.
        if (lastChar == '.'){
            sentenceType = "повествовательное.";
        } else if (lastChar == '?') {
            sentenceType = "вопросительное.";
        } else if (lastChar == '!') {
           sentenceType = "восклицательное.";
        } else {
            sentenceType = "неопределенный тип.";
        }

        // Вывод результатов:
        System.out.println("Количество символов: " + totalChars);
        System.out.println("Количество символов в верхнем регистре: " + upperCaseCount);
        System.out.println("Количество цифр: " + digitCount);
        System.out.println("Количество пробелов: " + spaceCount);
        System.out.println("Тип предложения: " + sentenceType);

    } // end of main
} // end of class
