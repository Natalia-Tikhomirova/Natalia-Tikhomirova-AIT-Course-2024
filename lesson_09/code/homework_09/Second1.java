package homework_09;

import java.util.Scanner;

public class Second1 {
    public static void main(String[] args) {

// Создаем объект Scanner для чтения ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Просим пользователя ввести время в формате часы:минуты:секунды, например "103045"
        System.out.print("Введите время в формате часы:минуты:секунды (например, 10:30:45): ");
        String timeInput = scanner.nextLine();

        // Извлечение частей времени из строки
        int hours = (timeInput.charAt(0) - '0') * 10 + (timeInput.charAt(1) - '0');
        int minutes = (timeInput.charAt(2) - '0') * 10 + (timeInput.charAt(3) - '0');
        int seconds = (timeInput.charAt(4) - '0') * 10 + (timeInput.charAt(5) - '0');

        // Вызов метода для вычисления общего количества секунд
        int totalSeconds = calculateSeconds(hours, minutes, seconds);

        // Вывод результата
        System.out.println("Total seconds: " + totalSeconds);

    }

    // Метод для вычисления общего количества секунд
    public static int calculateSeconds(int hours, int minutes, int seconds) {
        // 1 час = 3600 секунд, 1 минута = 60 секунд
        return hours * 3600 + minutes * 60 + seconds;
    }

}
