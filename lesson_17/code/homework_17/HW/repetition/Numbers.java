package homework_17.HW.repetition;

// Распечатать только 7 чисел от 1 до 100, которые делятся на 5 без остатка.
// Использовать цикл do...while.

public class Numbers {
    public static void main(String[] args) {

        int number = 1;                                // Начальное число
        int count = 1;                                 // Счетчик чисел, которые делятся на 5

        do {
            if (number % 5 == 0) {                     // Проверяем, делится ли число на 5 без остатка
                System.out.print(number + "  ");
                count++;                               // Увеличиваем счетчик, если число делится на 5
            }
            number++;                                  // Переходим к следующему числу
        }while ( count <= 7 && number <= 100);         // Цикл продолжается, пока не найдено 7 чисел

    } // end of main
} // end of class
