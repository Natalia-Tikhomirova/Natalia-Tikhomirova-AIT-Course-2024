package homework_27.supermarket.model;

import java.util.Objects;
import java.util.regex.Pattern;

public class Food extends Product {

    private String expDate;

    public Food(double price, String name, long barCode, String expDate) {
        super(price, name, barCode);
        this.expDate = expDate;
        setExpDate(expDate);
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {

        String datePattern = "\\d{4}-\\d{2}-\\d{2}";
        if(Pattern.matches(datePattern,expDate)){
            this.expDate = expDate;
        } else {
            System.out.println("Неверный формат даты. Ожидалось yyyy-MM-dd.");
            this.expDate = null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Food food)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(expDate, food.expDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), expDate);
    }
} // end of class
