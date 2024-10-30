package homework_34.time.utils;

import java.time.LocalDate;

public class LocalDateWithOriginal {

    private LocalDate date;
    private String originalDateStr;

    // Конструктор
    public LocalDateWithOriginal(LocalDate date, String originalDateStr) {
        this.date = date;
        this.originalDateStr = originalDateStr;
    }

    // Геттеры для даты и оригинальной строки
    public LocalDate getDate() {
        return date;
    }

    public String getOriginalDateStr() {
        return originalDateStr;
    }
} // end of class

