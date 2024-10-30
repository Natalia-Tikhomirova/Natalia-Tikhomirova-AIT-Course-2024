package homework_34.time.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;


public class DateOperation {

    //  Этот метод принимает дату рождения в виде стринга,
    //    и возвращающий возраст.

    public static int getAge(String birthDate) {

        // TODO Homework

        // Форматируем дату в возможные форматы: "dd/MM/yyyy" или "yyyy-MM-dd"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]");

        // Парсим строку с датой согласно указанным форматам
        LocalDate birthday = LocalDate.parse(birthDate, formatter);

        // Вычисляем и возвращаем возраст
        int res = (int) ChronoUnit.YEARS.between(birthday, LocalDate.now());
        return res;
    }


    public static String[] sortStringDates(String[] dates) {
        // TODO Homework

        // массив для хранения дат в формате LocalDate
        LocalDateWithOriginal[] localDatesWithOriginals = new LocalDateWithOriginal[dates.length];

        // Форматы даты
        DateTimeFormatter isoFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter euFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Парсинг строк с датами и сохранение оригинальной строки
        for (int i = 0; i < dates.length; i++) {
            String dateStr = dates[i];
            LocalDate date = null;

            // Проверка соответствия формату ISO (ГГГГ-ММ-ДД) и парсинг
            if (dateStr.matches("\\d{4}-\\d{2}-\\d{2}")) {
                date = LocalDate.parse(dateStr, isoFormatter); // Парсим дату
            }
            // Проверка соответствия формату EU (ДД/ММ/ГГГГ) и парсинг
            else if (dateStr.matches("\\d{2}/\\d{2}/\\d{4}")) {
                date = LocalDate.parse(dateStr, euFormatter); // Парсим дату
            }

            localDatesWithOriginals[i] = new LocalDateWithOriginal(date, dateStr);
        }

        // Сортировка массива по полю LocalDate
        Arrays.sort(localDatesWithOriginals, (d1, d2) -> d1.getDate().compareTo(d2.getDate()));

        // Массив отсортированных строк с оригинальными форматами
        String[] sortedDates = new String[dates.length];
        for (int i = 0; i < localDatesWithOriginals.length; i++) {
            sortedDates[i] = localDatesWithOriginals[i].getOriginalDateStr();
        }

        return sortedDates;
    }

} // end of class




