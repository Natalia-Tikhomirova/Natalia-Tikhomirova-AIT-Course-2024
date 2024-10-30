package homework_34.time.utils;

import java.time.LocalDate;

public class LocalDateWithOriginal {

    private LocalDate date;
    private String originalDateStr;


    public LocalDateWithOriginal(LocalDate date, String originalDateStr) {
        this.date = date;
        this.originalDateStr = originalDateStr;
    }


    public LocalDate getDate() {
        return date;
    }

    public String getOriginalDateStr() {
        return originalDateStr;
    }
} // end of class

