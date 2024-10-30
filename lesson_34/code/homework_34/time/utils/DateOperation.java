package homework_34.time.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.regex.Pattern;

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
        int res = Period.between(birthday, LocalDate.now()).getYears();
        return res;
    }

    // Регулярные выражения для проверки форматов
    private static final Pattern ISO_PATTERN = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
    private static final Pattern EU_PATTERN = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");

    public static String[] sortStringDates(String[] dates) {
        // TODO Homework

        // массив для хранения дат в формате LocalDate
        LocalDateWithOriginal[] localDatesWithOriginals = new LocalDateWithOriginal[dates.length];

        // Форматы даты
        DateTimeFormatter isoFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter euFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        // Парсинг строк с датами и сохранение оригинальной строки
        for (int i = 0; i < dates.length; i++) {
            LocalDate date = parseDateIfValid(dates[i], isoFormatter, euFormatter);
            localDatesWithOriginals[i] = new LocalDateWithOriginal(date, dates[i]);
        }

        // Сортировка массива по полю LocalDate
        Arrays.sort(localDatesWithOriginals, (d1, d2) -> {
            if (d1.getDate() == null) return 1;  // null в конец
            if (d2.getDate() == null) return -1; // null в конец
            return d1.getDate().compareTo(d2.getDate()); // Сравнение не-null дат
        });

        // Проверка результатов сортировки
        System.out.println("Отсортированные даты LocalDate с оригинальными форматами:");
        for (LocalDateWithOriginal localDateWithOriginal : localDatesWithOriginals) {
            System.out.println("Date: " + localDateWithOriginal.getDate() +
                    " | Original: " + localDateWithOriginal.getOriginalDateStr());
        }

        // Массив отсортированных строк с оригинальными форматами
        String[] sortedDates = new String[dates.length];
        for (int i = 0; i < localDatesWithOriginals.length; i++) {
            sortedDates[i] = localDatesWithOriginals[i].getOriginalDateStr();
        }

        return sortedDates;
    }

    // Метод для проверки и парсинга даты
    private static LocalDate parseDateIfValid(String dateStr, DateTimeFormatter isoFormatter, DateTimeFormatter euFormatter) {
        // Проверка соответствия формату ISO (ГГГГ-ММ-ДД)
        if (ISO_PATTERN.matcher(dateStr).matches()) {
            return LocalDate.parse(dateStr, isoFormatter); // Парсим дату
        }

        // Проверка соответствия формату EU (ДД/ММ/ГГГГ)
        if (EU_PATTERN.matcher(dateStr).matches()) {
            return LocalDate.parse(dateStr, euFormatter); // Парсим дату
        }

        return null; // Если ни один формат не подошел, возвращаем null
    }

} // end of class




