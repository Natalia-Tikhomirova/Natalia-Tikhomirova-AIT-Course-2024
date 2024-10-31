package homework_36;

// Заполните структуру типа ArrayList 20-ю случайными целыми числами в интервале от 1 до 10.
// Удалите из полученного списка дубликаты.

import java.util.*;

public class RandomNumbersList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        // Заполняем ArrayList 20 случайными числами от 1 до 10
        for (int i = 0; i < 20; i++) {
            int randomNum = random.nextInt(10) + 1;  // Генерация числа от 1 до 10
            numbers.add(randomNum);
        }

        System.out.println("Список с дубликатами: " + numbers);

        // Удаляем дубликаты
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);  // Добавление всех элементов списка в Set
        numbers = new ArrayList<>(uniqueNumbers);  // Преобразование Set обратно в ArrayList

        System.out.println("Список без дубликатов: " + numbers);
    }
} // end of class




