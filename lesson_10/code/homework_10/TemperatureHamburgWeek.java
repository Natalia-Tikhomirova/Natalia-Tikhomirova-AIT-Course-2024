package homework_10;

// Собрать в массив данные о дневной температуре в вашем городе за прошедшую неделю.
// Выведите на печать температуру, которая была во вторник и затем в четверг.
// Найти среднюю температуру за прошлую неделю.

public class TemperatureHamburgWeek {
    public static void main(String[] args) {

        // Массив температур за прошедшую неделю (температура с понедельника по воскресенье)
        int temperature [] = {19, 21, 24, 23, 23, 24, 24};

        // Вывод температуры за вторник (индекс 1)
        System.out.println( " Temperature on tuesday: " + temperature [1] + " °C ");

        // Вывод температуры за четверг (индекс 3)
        System.out.println( " Temperature on thursday: " + temperature [3] + " °C ");

        // Подсчет средней температуры за неделю
        int sum = 0;
        for (int i = 0; i < temperature.length; i++) {
             sum += temperature[i];
        }

        double averageTemperature = (double) sum / temperature.length; //casting

        // Вывод средней температуры
        System.out.println( " Average temperature for the week = " + averageTemperature + " °C ");

    }
}
